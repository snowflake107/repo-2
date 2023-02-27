package com.segment.analytics.kotlin.destinations.flurry

import android.os.Bundle
import io.mockk.every
import io.mockk.mockk
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(manifest = Config.NONE)
class FlurryDestinationTests {

    @Test
    fun `sample mock test`() {
        // https://mockk.io/#dsl-examples
        val bundle = mockk<Bundle>()
        every { bundle.get("key") }.returns("value")
    }
}
