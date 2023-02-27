package com.segment.analytics.kotlin.destinations.flurry

import com.segment.analytics.kotlin.core.*
import com.segment.analytics.kotlin.core.platform.DestinationPlugin
import com.segment.analytics.kotlin.core.platform.Plugin

class FlurryDestination : DestinationPlugin() {
    override val key: String = "Flurry"

    override fun update(settings: Settings, type: Plugin.UpdateType) {
        super.update(settings, type)
        if (type == Plugin.UpdateType.Initial) {
        }
    }

    override fun alias(payload: AliasEvent): BaseEvent? {
        return super.alias(payload)
    }

    override fun group(payload: GroupEvent): BaseEvent? {
        return super.group(payload)
    }

    override fun identify(payload: IdentifyEvent): BaseEvent? {
        return super.identify(payload)
    }

    override fun screen(payload: ScreenEvent): BaseEvent? {
        return super.screen(payload)
    }

    override fun track(payload: TrackEvent): BaseEvent? {
        return super.track(payload)
    }
}