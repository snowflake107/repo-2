package com.segment.analytics.kotlin.destinations.flurry

import android.app.Activity
import android.content.Context
import android.util.Log
import com.flurry.android.Constants
import com.flurry.android.FlurryAgent
import com.flurry.android.FlurryAgentListener
import com.segment.analytics.kotlin.android.plugins.AndroidLifecycle
import com.segment.analytics.kotlin.core.*
import com.segment.analytics.kotlin.core.platform.DestinationPlugin
import com.segment.analytics.kotlin.core.platform.Plugin
import com.segment.analytics.kotlin.core.platform.plugins.logger.log
import com.segment.analytics.kotlin.core.utilities.toContent
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonObject

class FlurryDestination :
    DestinationPlugin(), AndroidLifecycle {
    companion object {
        private const val FLURRY_FULL_KEY = "Flurry"
    }

    override val key: String = FLURRY_FULL_KEY
    internal var flurryAgentBuilder: FlurryAgent.Builder = FlurryAgent.Builder()
    internal var flurrySettings: FlurrySettings? = null

    override fun update(settings: Settings, type: Plugin.UpdateType) {
        super.update(settings, type)
        if (settings.hasIntegrationSettings(this)) {
            this.flurrySettings = settings.destinationSettings(key, FlurrySettings.serializer())
            if (type == Plugin.UpdateType.Initial) {
                val sessionContinueMillis: Long =
                    flurrySettings!!.sessionContinueSeconds * 1000
                flurryAgentBuilder
                    .withContinueSessionMillis(sessionContinueMillis)
                    .withCaptureUncaughtExceptions(flurrySettings!!.captureUncaughtExceptions)
                    .withLogEnabled(true)
                    .withLogLevel(Log.VERBOSE)
                    .withListener(
                        FlurryAgentListener() {
                            fun onSessionStarted() {
                                analytics.log("onSessionStarted")
                            }
                        })
                    .build(analytics.configuration.application as Context, flurrySettings!!.apiKey)
                analytics.log(
                    "FlurryAgent.Builder()\n" +
                            ".withContinueSessionMillis($sessionContinueMillis)\n" +
                            ".withCaptureUncaughtExceptions(${flurrySettings!!.captureUncaughtExceptions})\n" +
                            ".withLogEnabled(true)\n" +
                            ".withLogLevel(Log.VERBOSE)\n" +
                            ".build(application as Context, ${flurrySettings!!.apiKey})"
                )

                // It will track where app is being used. It will use cached value (to avoid excessive battery usage) when location reporting is enabled.
                FlurryAgent.setReportLocation(flurrySettings!!.reportLocation)
                analytics.log("FlurryAgent.setReportLocation(${flurrySettings!!.reportLocation})")

                // Start a session so that queued events can be delivered (even if no activities are started).
                FlurryAgent.onStartSession(analytics.configuration.application as Context)
                analytics.log("FlurryAgent.onStartSession(application)")
            }
        }
    }


    override fun identify(payload: IdentifyEvent): BaseEvent {
        FlurryAgent.setUserId(payload.userId)
        analytics.log("FlurryAgent.setUserId(${payload.userId})")

        val traitsMap = payload.traits.asStringMap()
        val age: Int = (traitsMap["age"] ?: "0").toInt()
        if (age > 0) {
            FlurryAgent.setAge(age)
            analytics.log("FlurryAgent.setAge($age)")
        }

        val gender: String = (traitsMap["gender"] ?: "")
        if (gender.isNotEmpty()) {
            val genderConstant: Byte =
                if (gender.equals("female", true) ||
                    gender.equals("f", true)
                ) {
                    Constants.FEMALE
                } else if (gender.equals("male", true) ||
                    gender.equals("m", true)
                ) {
                    Constants.MALE
                } else {
                    Constants.UNKNOWN
                }
            FlurryAgent.setGender(genderConstant)
            analytics.log("FlurryAgent.setGender($gender)")
        }
        return payload
    }

    override fun screen(payload: ScreenEvent): BaseEvent {
        val properties: Map<String, String> = payload.properties.asStringMap()
        FlurryAgent.logEvent(payload.name, properties)
        analytics.log("FlurryAgent.logEvent(${payload.name}, ${properties})")
        return payload
    }

    override fun track(payload: TrackEvent): BaseEvent {
        val properties: Map<String, String> = payload.properties.asStringMap()
        FlurryAgent.logEvent(payload.event, properties)
        analytics.log("FlurryAgent.logEvent(${payload.event}, ${properties})")
        return payload
    }

    /**
     * AndroidActivity Lifecycle Methods
     */
    override fun onActivityStarted(activity: Activity?) {
        super.onActivityStarted(activity)
        FlurryAgent.onStartSession(activity!!)
        analytics.log("FlurryAgent.onStartSession(application)")
    }

    override fun onActivityStopped(activity: Activity?) {
        super.onActivityStopped(activity)
        FlurryAgent.onEndSession(activity!!)
        analytics.log("FlurryAgent.onEndSession(application)")
    }
}

/**
 * Flurry Settings data class.
 */
@Serializable
data class FlurrySettings(
    // Flurry API Key
    var apiKey: String,
    // Enabling this will log uncaught exceptions, default is false
    var captureUncaughtExceptions: Boolean = false,
    //  report location
    var reportLocation: Boolean = true,
    //  Enabling this will send data through screen calls as events.
    var screenTracksEvents: Boolean,
    //  Session Continue Seconds, default is 10
    val sessionContinueSeconds: Long = 10,
    //  Enabling this will send data to Flurry securely.
    var useHttps: Boolean
)

private fun JsonObject.asStringMap(): Map<String, String> = this.mapValues { (_, value) ->
    value.toContent().toString()
}
