package com.seribits.daggersezzh.results;

import com.seribits.daggersezzh.modules.MessageModule;

import dagger.Subcomponent;

/**
 * Created by sezzh on 17/02/17.
 */

@Subcomponent(
        modules = {
                ResultActivityModule.class
        }
)
public interface ResultActivityComponent {

    ResultActivity inject(ResultActivity resultActivity);
}
