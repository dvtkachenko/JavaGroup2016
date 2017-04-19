package com.time_task_manager.database;

import java.sql.Connection;

/**
 * Created by diman on 19.04.2017.
 */
public interface Database {
    Connection getDBConnection();

}
