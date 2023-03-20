package com.segment.analytics.kotlin.destinations.flurry

import android.app.Activity
import android.app.Application
import android.content.Context
import android.util.Log
import com.flurry.android.Constants
import com.flurry.android.FlurryAgent
import com.segment.analytics.kotlin.core.*
import com.segment.analytics.kotlin.core.platform.Plugin
import com.segment.analytics.kotlin.core.utilities.LenientJson
import io.mockk.*
import io.mockk.impl.annotations.MockK
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(manifest = Config.NONE)
class FlurryDestinationTests {
    @MockK(relaxUnitFun = true)
    lateinit var mockApplication: Application

    @MockK(relaxUnitFun = true)
    lateinit var mockedContext: Context

    @MockK(relaxUnitFun = true)
    lateinit var mockedAnalytics: Analytics

    @MockK(relaxUnitFun = true)
    lateinit var mockedFlurryAgentBuilder: FlurryAgent.Builder
    lateinit var mockedFlurryDestination: FlurryDestination

    init {
        MockKAnnotations.init(this)
    }

    @Before
    fun setUp() {
        mockkStatic(FlurryAgent::class)
        mockedFlurryDestination = FlurryDestination()
        mockedFlurryDestination.flurryAgentBuilder = mockedFlurryAgentBuilder
        mockedFlurryDestination.analytics = mockedAnalytics
        every { mockedAnalytics.configuration.application } returns mockApplication
        every { mockApplication.applicationContext } returns mockedContext
    }

    @Test
    fun `settings are updated correctly`() {
        // An Flurry example settings
        val sampleFlurrySettings: Settings = LenientJson.decodeFromString(
            """
            {
              "integrations": {
                "Flurry": {
                  "apiKey": "APIKEY1234567890",
                  "captureUncaughtExceptions": false,
                  "reportLocation": true,
                  "screenTracksEvents": true,
                  "sessionContinueSeconds": 10,
                  "useHttps": true
                }
              }
            }
        """.trimIndent()
        )
        every { mockedFlurryAgentBuilder.withContinueSessionMillis(10000) } returns mockedFlurryAgentBuilder
        every { mockedFlurryAgentBuilder.withCaptureUncaughtExceptions(false) } returns mockedFlurryAgentBuilder
        every { mockedFlurryAgentBuilder.withLogEnabled(true) } returns mockedFlurryAgentBuilder
        every { mockedFlurryAgentBuilder.withLogLevel(Log.VERBOSE) } returns mockedFlurryAgentBuilder
        every { mockedFlurryAgentBuilder.withListener(any()) } returns mockedFlurryAgentBuilder

        val flurrySettings: Settings = sampleFlurrySettings
        mockedFlurryDestination.update(flurrySettings, Plugin.UpdateType.Initial)

//         assertions Flurry config
        Assertions.assertNotNull(mockedFlurryDestination.flurrySettings)
        with(mockedFlurryDestination.flurrySettings!!) {
            assertEquals(apiKey, "APIKEY1234567890")
            assertEquals(captureUncaughtExceptions, false)
            assertEquals(reportLocation, true)
            assertEquals(screenTracksEvents, true)
            assertEquals(sessionContinueSeconds, 10)
            assertEquals(useHttps, true)
        }

        verify { mockedFlurryAgentBuilder.withContinueSessionMillis(10000) }
        verify { mockedFlurryAgentBuilder.withCaptureUncaughtExceptions(false) }
        verify { mockedFlurryAgentBuilder.withLogEnabled(true) }
        verify { mockedFlurryAgentBuilder.withLogLevel(Log.VERBOSE) }
        verify { mockedFlurryAgentBuilder.withListener(any()) }
        verify { FlurryAgent.setReportLocation(true) }
        verify { FlurryAgent.onStartSession(mockApplication) }
    }

    @Test
    fun `activity start handled correctly`() {
        val activity: Activity = mockkClass(Activity::class)
        mockedFlurryDestination.onActivityStarted(activity)
        verify { FlurryAgent.onStartSession(activity) }
    }

    @Test
    fun `activity start stopped correctly`() {
        val activity: Activity = mockkClass(Activity::class)
        mockedFlurryDestination.onActivityStopped(activity)
        verify { FlurryAgent.onEndSession(activity) }
    }

    @Test
    fun `identify handled correctly`() {
        val identifyEvent = IdentifyEvent(
            userId = "User-Id-123",
            traits = emptyJsonObject
        )
        mockedFlurryDestination.identify(identifyEvent)
        verify { FlurryAgent.setUserId("User-Id-123") }
    }

    @Test
    fun `identify with traits handled correctly`() {
        val identifyEvent = IdentifyEvent(
            userId = "User-Id-123",
            traits = buildJsonObject {
                put("age", 10)
                put("gender", "f")
            }
        )
        mockedFlurryDestination.identify(identifyEvent)
        verify { FlurryAgent.setUserId("User-Id-123") }
        verify { FlurryAgent.setAge(10) }
        verify { FlurryAgent.setGender(Constants.FEMALE) }
    }

    @Test
    fun `screen handled correctly`() {
        val sampleEvent = ScreenEvent(
            name = "Screen 1",
            category = "Category 1",
            properties = emptyJsonObject
        ).apply {
            context = emptyJsonObject
        }
        mockedFlurryDestination.screen(sampleEvent)
        verify { FlurryAgent.logEvent("Screen 1", mapOf()) }
    }

    @Test
    fun `screen with properties handled correctly`() {
        val sampleEvent = ScreenEvent(
            name = "Screen 2",
            category = "Category 2",
            properties = buildJsonObject {
                put("test1", "screen test1 Value")
                put("test2", "screen test2 Value")
            }
        ).apply {
            context = emptyJsonObject
        }
        mockedFlurryDestination.screen(sampleEvent)
        val expectedProperties: MutableMap<String, String> = HashMap()
        expectedProperties["test1"] = "screen test1 Value"
        expectedProperties["test2"] = "screen test2 Value"
        verify { FlurryAgent.logEvent("Screen 2", expectedProperties) }
    }

    @Test
    fun `track handled correctly`() {
        val sampleEvent = TrackEvent(
            event = "Track 1",
            properties = emptyJsonObject
        ).apply {
            context = emptyJsonObject
        }
        mockedFlurryDestination.track(sampleEvent)
        verify { FlurryAgent.logEvent("Track 1", mapOf()) }
    }

    @Test
    fun `track with properties handled correctly`() {
        val sampleEvent = TrackEvent(
            event = "Track 1",
            properties = buildJsonObject {
                put("test1", "track test1 Value")
                put("test2", "track test2 Value")
            }
        ).apply {
            context = emptyJsonObject
        }
        mockedFlurryDestination.track(sampleEvent)
        val expectedProperties: MutableMap<String, String> = HashMap()
        expectedProperties["test1"] = "track test1 Value"
        expectedProperties["test2"] = "track test2 Value"
        verify { FlurryAgent.logEvent("Track 1", expectedProperties) }
    }
}
