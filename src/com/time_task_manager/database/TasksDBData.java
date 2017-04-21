package com.time_task_manager.database;

/**
 * Created by diman on 21.04.2017.
 */
public class TasksDBData {

    private int root_task_id;
    private int parent_subtask_id;
    private int child_subtask_id;
    private int level_subtask_id;
    private int user_id;
    private String task_name;

       (	"ROOT_TASK_ID" TasksDBData(8,0) NOT NULL ENABLE,
	"PARENT_SUBTASK_ID" TasksDBData(8,0) NOT NULL ENABLE,
	"CHILD_SUBTASK_ID" TasksDBData(8,0) NOT NULL ENABLE,
	"LEVEL_SUBTASK_ID" TasksDBData(8,0),
	"USER_ID" TasksDBData(8,0) NOT NULL ENABLE,
	"TASK_NAME" TasksDBData(100BYTE) NOT NULL ENABLE,
	"PLAN_START_TIME" DATE,
            "PLAN_END_TIME" DATE,
            "PLAN_DURATION" TasksDBData(8,0) NOT NULL ENABLE,
	"FACT_START_TIME" DATE,
            "FACT_END_TIME" DATE,
            "FACT_DURATION" TasksDBData(8,0) NOT NULL ENABLE,
	"VERSION" TasksDBData(8,0) NOT NULL ENABLE,
	"IS_COMPLETED" TasksDBData(1BYTE) DEFAULT 'N' NOT NULL ENABLE
   ) SEGMENT CREATION IMMEDIATE
    PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
    TasksDBData(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
            PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
    TABLESPACE "SYSTEM" ;


}
