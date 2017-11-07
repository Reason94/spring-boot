package com.reason.springboot.model;

import javax.validation.constraints.NotNull;

/**
 * Created by L8104 on 2017/11/7.
 */
public class User {

    @NotNull
    private String userName;

    @NotNull
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
