package com.seribits.daggersezzh.modules;

import android.app.Application;

import com.seribits.daggersezzh.io.models.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sezzh on 17/02/17.
 */

@Module
public class AppModule {
    private Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return application;
    }

    @Provides
    @Singleton
    User provideUser() {
        return new User("sezzh", "cruz");
    }

}
