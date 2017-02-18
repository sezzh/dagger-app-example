package com.seribits.daggersezzh.components;

import com.seribits.daggersezzh.MainActivity;
import com.seribits.daggersezzh.modules.MainActivityModule;

import dagger.Subcomponent;

/**
 * Created by sezzh on 17/02/17.
 */
//@ActivityScope
@Subcomponent(
        modules = {
                MainActivityModule.class
        }
)
public interface MainActivityComponent {
    MainActivity inject(MainActivity mainActivity);
}
