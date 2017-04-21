package com.time_task_manager.database;

/**
 * Created by diman on 19.04.2017.
 */

public class UsersDBData {
    private int userID;
    private String userName;
    private String userPassword;

    public int getUser_id() {
        return userID;
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

    @Override
    public String toString() {
        return "UsersDBData{" +
                "user_id=" + userID +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
