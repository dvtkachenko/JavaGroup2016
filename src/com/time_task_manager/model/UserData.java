package com.time_task_manager.model;

/**
 * Created by diman on 19.04.2017.
 */

public class UserData {
    private int user_id;
    private String userName;
    private String userPassword;
    private String userDescription;

    public int getUser_id() {
        return user_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "user_id=" + user_id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userDescription='" + userDescription + '\'' +
                '}';
    }
}
