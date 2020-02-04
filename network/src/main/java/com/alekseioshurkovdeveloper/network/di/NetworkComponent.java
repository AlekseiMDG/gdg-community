package com.alekseioshurkovdeveloper.network.di;

import com.alekseioshurkovdeveloper.network.NetworkGatewayFactory;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = NetworkModule.class)
@Singleton
public abstract class NetworkComponent {

    private static volatile NetworkComponent sNetworkComponent;

    public static NetworkComponent initAndGet() {

        if (sNetworkComponent == null) {
            synchronized (NetworkComponent.class) {
                if (sNetworkComponent == null) {
                    sNetworkComponent = DaggerNetworkComponent.builder()
                            .build();
                }
            }
        }

        return sNetworkComponent;
    }

    public static NetworkComponent get() {
        if (sNetworkComponent == null) {
            throw new RuntimeException("You must call 'initAndGet()' method");
        }
        return sNetworkComponent;
    }

    public static void releaseComponent() {
        sNetworkComponent = null;
    }

    public abstract NetworkGatewayFactory getNetworkGatewayFactory();
}
