package com.seribits.daggersezzh.components;

import com.seribits.daggersezzh.BackendService;
import com.seribits.daggersezzh.MainActivity;
import com.seribits.daggersezzh.modules.BackendServiceModule;


import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by sezzh on 15/02/17.
 */

@Singleton
@Component(modules = {BackendServiceModule.class})
public interface MyComponent {

    //provide the dependency for dependent components
    //(not needed for single-component setups)
    BackendService providesBackendService();

    //allow to inject into our main class
    void inject(MainActivity activity);

}
