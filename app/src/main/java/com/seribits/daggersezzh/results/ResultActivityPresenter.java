package com.seribits.daggersezzh.results;

import com.seribits.daggersezzh.io.models.User;

/**
 * Created by sezzh on 17/02/17.
 */

public class ResultActivityPresenter {

    private ResultActivity resultActivity;

    private String messageFromMain;
    private User user;

    public ResultActivityPresenter(
            ResultActivity resultActivity,
            String messageFromMain,
            User user) {
        this.resultActivity = resultActivity;
        this.messageFromMain = messageFromMain;
        this.user = user;
    }

    public String getMessageFromMain() {
        return String.format("%s, from: %s", messageFromMain, user.getFirstName());
    }

    public void setMessageFromMain(String messageFromMain) {
        this.messageFromMain = messageFromMain;
    }
}
