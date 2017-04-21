package com.time_task_manager.database;

import java.util.List;

/**
 * Created by diman on 19.04.2017.
 */
public interface UsersDBAction {
    boolean addUser(String userName, String userPassword);
    boolean deleteUser(String userName);
    boolean changePassword(String userName, String userPassword, String userDescription);
    boolean checkUser(String userName);
    UsersDBData getUserData(String userName);
    List<UsersDBData> getAllUsersData();
}
