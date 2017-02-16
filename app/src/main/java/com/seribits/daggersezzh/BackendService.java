package com.seribits.daggersezzh;

import com.seribits.daggersezzh.components.DaggerUserComponent;
import com.seribits.daggersezzh.components.UserComponent;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by sezzh on 15/02/17.
 */

public class BackendService {

    @Inject
    public User user;
    private String serverUrl;
    private UserComponent component;

    @Inject
    public BackendService(@Named("serverUrl") String serverUrl) {
        this.serverUrl = serverUrl;
        component = DaggerUserComponent.builder().build();
        component.inject(this);

    }

    public String callServer() {
        if (user != null && serverUrl != null && serverUrl.length() > 0) {
            return "User: " + user;
        }
        return "no user...";
    }

}
