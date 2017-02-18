package com.seribits.daggersezzh.components;

import com.seribits.daggersezzh.modules.MessageModule;
import com.seribits.daggersezzh.results.ResultActivityComponent;
import com.seribits.daggersezzh.results.ResultActivityModule;

import dagger.Subcomponent;

/**
 * Created by sezzh on 17/02/17.
 */

@Subcomponent(
        modules = {
                MessageModule.class
        }
)
public interface MessageComponent {
    ResultActivityComponent plus(ResultActivityModule resultActivityModule);
}
