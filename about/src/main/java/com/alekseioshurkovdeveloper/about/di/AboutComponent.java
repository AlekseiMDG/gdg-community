package com.alekseioshurkovdeveloper.about.di;

import com.alekseioshurkovdeveloper.about.presentation.factory.AboutGroupFactory;
import com.alekseioshurkovdeveloper.network.di.NetworkComponent;

import dagger.Component;

@Component(dependencies = {NetworkComponent.class}, modules = {AboutModule.class})
@AboutGroupScope
public abstract class AboutComponent {
    private static volatile AboutComponent sAboutGroupFeatureComponent;

    public static AboutComponent initAndGet(NetworkComponent networkComponent) {
        if (sAboutGroupFeatureComponent == null) {
            synchronized (AboutComponent.class) {
                if (sAboutGroupFeatureComponent == null) {
                    sAboutGroupFeatureComponent = DaggerAboutComponent
                            .builder()
                            .networkComponent(networkComponent)
                            .build();
                }
            }
        }
        return sAboutGroupFeatureComponent;
    }

    public static AboutComponent get() {
        if (sAboutGroupFeatureComponent == null) {
            throw new RuntimeException("You must call 'initAndGet()' method");
        }
        return sAboutGroupFeatureComponent;
    }

    public void releaseComponent() {
        sAboutGroupFeatureComponent = null;
    }

    public abstract AboutGroupFactory getAboutGroupFactory();
}
