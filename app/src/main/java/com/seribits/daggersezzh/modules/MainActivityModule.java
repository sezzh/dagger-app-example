package com.seribits.daggersezzh.modules;

import com.seribits.daggersezzh.MainActivity;
import com.seribits.daggersezzh.MainActivityPresenter;
import com.seribits.daggersezzh.io.models.User;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sezzh on 17/02/17.
 */
@Module
public class MainActivityModule {

    private MainActivity mainActivity;

    public MainActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Provides
    //@ActivityScope
    MainActivity provideMainActivity() {
        return mainActivity;
    }

    @Provides
    MainActivityPresenter provideMainActivityPresenter(User user) {
        return new MainActivityPresenter(mainActivity, user);
    }
}
