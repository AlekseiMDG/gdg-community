package com.alekseioshurkovdeveloper.about.di;

import com.alekseioshurkovdeveloper.about.data.AboutGroupRepository;
import com.alekseioshurkovdeveloper.about.domain.AboutInteractor;
import com.alekseioshurkovdeveloper.about.presentation.factory.AboutGroupFactory;
import com.alekseioshurkovdeveloper.about.utils.ConverterToPresentationModel;
import com.alekseioshurkovdeveloper.network.NetworkGatewayFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class AboutModule {

    @Provides
    @AboutGroupScope
    AboutGroupRepository provideAboutGroupRepository(NetworkGatewayFactory networkGateway) {
        return new AboutGroupRepository(networkGateway);
    }

    @Provides
    AboutGroupFactory provideAboutGroupFactory(AboutInteractor iteractot) {
        ConverterToPresentationModel converter = new ConverterToPresentationModel();
        return new AboutGroupFactory(iteractot, converter);
    }

    @Provides
    AboutInteractor provideAboutInterctor(AboutGroupRepository repository){
        return new AboutInteractor(repository);
    }
}
