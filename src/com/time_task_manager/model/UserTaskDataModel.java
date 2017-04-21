package com.time_task_manager.model;

import java.util.List;

/**
 * Created by diman on 19.04.2017.
 */

// it is a layer for work with data of TIMETASKMANAGER

public class UserTaskDataModel {
    private int userID;
    private String userName;
    private String userPassword;

    List<TaskNode> tasks;
}
