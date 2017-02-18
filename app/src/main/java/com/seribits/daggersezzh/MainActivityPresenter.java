package com.seribits.daggersezzh;

import com.seribits.daggersezzh.io.models.User;

/**
 * Created by sezzh on 17/02/17.
 */

public class MainActivityPresenter {
    private MainActivity mainActivity;
    private User user;

    public MainActivityPresenter(MainActivity mainActivity, User user) {
        this.mainActivity = mainActivity;
        this.user = user;
    }

    public String getNewUserName() {
        user.setFirstName("Chucho");
        return String.format(
                "New User: %s, %s", user.getFirstName(), user.getLastName()
        );
    }

    public void openNewActivityByPresenter() {
        mainActivity.openNewActivity("holo boli caramboli");
    }
}
