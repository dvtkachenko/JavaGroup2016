--------------------------------------------------------
--  File created - �������-������-21-2017   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table TASKS
--------------------------------------------------------

  CREATE TABLE "TIMETASKMANAGER"."TASKS" 
   (	"TASK_ID" NUMBER(8,0), 
	"PARENT_TASK_ID" NUMBER(8,0), 
	"TASK_NAME" VARCHAR2(100 BYTE), 
	"USER_ID" NUMBER(8,0), 
	"START_TIME_PLAN" DATE, 
	"END_TIME_PLAN" DATE, 
	"DURATION_PLAN" NUMBER(8,0), 
	"START_TIME_FACT" DATE, 
	"END_TIME_FACT" DATE, 
	"DURATION_FACT" NUMBER(8,0), 
	"COMMENTS" VARCHAR2(200 BYTE), 
	"LEVEL_ID" NUMBER(8,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index INDEX_PARENT_TASK_ID
--------------------------------------------------------

  CREATE INDEX "TIMETASKMANAGER"."INDEX_PARENT_TASK_ID" ON "TIMETASKMANAGER"."TASKS" ("PARENT_TASK_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index INDEX_TASK_ID
--------------------------------------------------------

  CREATE UNIQUE INDEX "TIMETASKMANAGER"."INDEX_TASK_ID" ON "TIMETASKMANAGER"."TASKS" ("TASK_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table TASKS
--------------------------------------------------------

  ALTER TABLE "TIMETASKMANAGER"."TASKS" MODIFY ("LEVEL_ID" NOT NULL ENABLE);
  ALTER TABLE "TIMETASKMANAGER"."TASKS" MODIFY ("USER_ID" NOT NULL ENABLE);
  ALTER TABLE "TIMETASKMANAGER"."TASKS" MODIFY ("TASK_NAME" NOT NULL ENABLE);
  ALTER TABLE "TIMETASKMANAGER"."TASKS" MODIFY ("PARENT_TASK_ID" NOT NULL ENABLE);
  ALTER TABLE "TIMETASKMANAGER"."TASKS" ADD CONSTRAINT "INDEX_TASK_ID" PRIMARY KEY ("TASK_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
