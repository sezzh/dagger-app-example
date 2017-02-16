package com.seribits.daggersezzh.components;

import com.seribits.daggersezzh.BackendService;
import com.seribits.daggersezzh.User;
import com.seribits.daggersezzh.modules.UserModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by sezzh on 15/02/17.
 */
@Singleton
@Component(modules = {UserModule.class})
public interface UserComponent {

    User providesUser();

    void inject(BackendService backendService);

}
