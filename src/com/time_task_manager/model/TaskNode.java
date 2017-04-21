package com.time_task_manager.model;

import java.util.Date;
import java.util.List;

/**
 * Created by diman on 21.04.2017.
 */
public class TaskNode {

    private TaskNode parentTaskNode;

    private int taskID;
    private int taskLevelID;
    private String taskName;
    private Date planStartTime;
    private Date planEndTime;
    private int planDuration;
    private Date factStartTime;
    private Date factEndTime;
    private int factDuration;
    private int version;
    private boolean isCompleted;
    private boolean isChangedByUser = false;

    List<TaskNode> childTaskNodes;
}
