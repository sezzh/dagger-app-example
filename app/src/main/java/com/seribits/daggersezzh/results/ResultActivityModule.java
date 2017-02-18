package com.seribits.daggersezzh.results;

import com.seribits.daggersezzh.io.models.User;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sezzh on 17/02/17.
 */
@Module
public class ResultActivityModule {
    private ResultActivity resultActivity;

    public ResultActivityModule(ResultActivity resultActivity) {
        this.resultActivity = resultActivity;
    }

    @Provides
    ResultActivity provideResultActivity() {
        return resultActivity;
    }

    @Provides
    ResultActivityPresenter provideResultActivityPresenter(String message, User user) {
        return new ResultActivityPresenter(resultActivity, message, user);
    }
}
