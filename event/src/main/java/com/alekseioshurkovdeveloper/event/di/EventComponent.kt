package com.alekseioshurkovdeveloper.event.di

import dagger.Component

@Component(modules = [EventModule::class])
interface EventComponent {

    companion object {
        @Volatile
        private var sComponent: EventComponent? = null

        fun initEventComponent(): EventComponent {
            if (sComponent == null) {
                synchronized(EventComponent::class) {
                    if (sComponent == null) {
                        sComponent = DaggerEventComponent.builder()
                            .build()
                    }
                }
            }
            return sComponent!!
        }

        fun get() = sComponent

        fun releaseComponent() {
            sComponent = null
        }
    }
}