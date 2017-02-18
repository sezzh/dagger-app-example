package com.seribits.daggersezzh.components;

import com.seribits.daggersezzh.modules.AppModule;
import com.seribits.daggersezzh.modules.MainActivityModule;
import com.seribits.daggersezzh.modules.MessageModule;
import com.seribits.daggersezzh.results.ResultActivityComponent;
import com.seribits.daggersezzh.results.ResultActivityModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by sezzh on 17/02/17.
 */
@Singleton
@Component(
        modules = {
                AppModule.class
        }
)
public interface AppComponent {
    MainActivityComponent plus(MainActivityModule mainActivityModule);
    MessageComponent plus(MessageModule messageModule);
}
