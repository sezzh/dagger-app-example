package com.seribits.daggersezzh.modules;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sezzh on 17/02/17.
 */
@Module
public class MessageModule {
    private String message;

    public MessageModule(String message) {
        this.message = message;
    }

    @Provides
    String provideMessage() {
        return message;
    }
}
