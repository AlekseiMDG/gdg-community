package com.alekseioshurkovdeveloper.about.di;

import com.alekseioshurkovdeveloper.about.data.AboutGroupRepository;
import com.alekseioshurkovdeveloper.about.domain.converter.AboutDomainConverter;
import com.alekseioshurkovdeveloper.about.domain.AboutInteractor;
import com.alekseioshurkovdeveloper.about.presentation.factory.AboutGroupFactory;
import com.alekseioshurkovdeveloper.about.presentation.converter.AboutPresentationConverter;
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
        AboutPresentationConverter converter = new AboutPresentationConverter();
        return new AboutGroupFactory(iteractot, converter);
    }

    @Provides
    AboutInteractor provideAboutInterctor(AboutGroupRepository repository){
        return new AboutInteractor(repository, new AboutDomainConverter());
    }
}
