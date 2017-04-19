package com.time_task_manager.database.oracle;

import com.time_task_manager.database.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by diman on 19.04.2017.
 */

final class OracleDBInfo {
    public static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521";

    public static final String DB_USER = "TIMETASKMANAGER";
    public static final String DB_PASSWORD = "12345";
    public static final String selectTableSQL = "SELECT * FROM USERS";
}

public class OracleDB implements Database {

    @Override
    public Connection getDBConnection() {
        Connection dbConnection = null;
        try {
            Class.forName(OracleDBInfo.DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            dbConnection = DriverManager.getConnection(OracleDBInfo.DB_CONNECTION, OracleDBInfo.DB_USER, OracleDBInfo.DB_PASSWORD);
            return dbConnection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dbConnection;
    }

    public static void main(String[] args) {
        Connection dbConnection = new OracleDB().getDBConnection();
    }
}
