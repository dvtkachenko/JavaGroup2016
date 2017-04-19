package com.time_task_manager.database;

import com.time_task_manager.model.UserData;

import java.util.List;

/**
 * Created by diman on 19.04.2017.
 */
public interface UserAction {
    boolean addUser(String userName, String userPassword, String userDescription);
    boolean deleteUser(String userName);
    boolean updateUser(String userName, String userPassword, String userDescription);
    boolean checkUser(String userName);
    UserData getUserData(String userName);
    List<UserData> getAllUsersData();
}
