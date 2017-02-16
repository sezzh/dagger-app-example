package com.seribits.daggersezzh.modules;

import com.seribits.daggersezzh.BackendService;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sezzh on 15/02/17.
 */

@Module
public class BackendServiceModule {

    @Provides
    @Singleton
    BackendService providesBackendService(
            @Named("serverUrl") String serverUrl) {
        return new BackendService(serverUrl);
    }

    @Provides
    @Named("serverUrl")
    String providesServerUrl() {
        return "http://www.vogella.com";
    }

    @Provides
    @Named("anotherUrl")
    String providesAnotherUrl() {
        return "http://google.com";
    }
}
