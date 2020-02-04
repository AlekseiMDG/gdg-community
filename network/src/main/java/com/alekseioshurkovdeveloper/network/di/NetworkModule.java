package com.alekseioshurkovdeveloper.network.di;

import com.alekseioshurkovdeveloper.network.MeetupServiceCreator;
import com.alekseioshurkovdeveloper.network.NetworkGatewayFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {

    @Provides
    NetworkGatewayFactory provideNetworkGatewayFactory(MeetupServiceCreator meetupServiceCreator){
        return new NetworkGatewayFactory(meetupServiceCreator);
    }

    @Provides
    @Singleton
    MeetupServiceCreator provideMeetupServiceCreator(){
        return new MeetupServiceCreator();
    }
}
