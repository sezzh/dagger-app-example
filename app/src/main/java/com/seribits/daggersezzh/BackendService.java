package com.seribits.daggersezzh;

import javax.inject.Inject;

/**
 * Created by sezzh on 15/02/17.
 */

public class BackendService {

    private String user;


    public BackendService(String user) {
        this.user = user;
    }

    public String getInjectedUser() {
        return String.format("usuario : %s", user);
    }


}
