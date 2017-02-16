package com.seribits.daggersezzh.modules;

import com.seribits.daggersezzh.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sezzh on 15/02/17.
 */

@Module
public class UserModule {

    @Provides
    @Singleton
    User providesUser() {
        return new User("sezzh", "cruz");
    }

}
