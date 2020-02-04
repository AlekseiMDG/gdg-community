package com.alekseioshurkovdeveloper.meetupclient

import android.app.Application
import com.alekseioshurkovdeveloper.network.di.NetworkComponent

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        createNetworkComponent()
    }

    private fun createNetworkComponent() {
        NetworkComponent.initAndGet()
    }
}