package com.seribits.daggersezzh;

/**
 * Created by sezzh on 15/02/17.
 */

import javax.inject.Inject;

public class User {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
