package com.time_task_manager.database.oracle;

import com.time_task_manager.database.DatabaseAction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;

/**
 * Created by diman on 19.04.2017.
 */

// before you run your project you should add "-Duser.language=en -Duser.region=us"
// string ... use menu "run/edit configurations" and parametr "VM options"
// or use in your code before connection to Oracle Locale.setDefault(Locale.ENGLISH)

final class OracleDBConnectionInfo {
    public static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:xe";

    public static final String DB_USER = "TIMETASKMANAGER";
//    public static final String DB_USER = "SYSTEM";
    public static final String DB_PASSWORD = "12345";
//    public static final String DB_PASSWORD = "admin1977";
//    public static final String selectTableSQL = "SELECT * FROM USERS";
}

public class OracleDB implements DatabaseAction {

    private Locale defaultLocale = Locale.getDefault();

    @Override
    public Connection getDBConnection() {
        Connection dbConnection = null;

        try {
            Class.forName(OracleDBConnectionInfo.DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            // for correct connection to Oracle database
            Locale.setDefault(Locale.ENGLISH);
//        System.out.println(Locale.getDefault().getDisplayCountry() + Locale.getDefault().getDisplayLanguage());

            dbConnection = DriverManager.getConnection(OracleDBConnectionInfo.DB_CONNECTION,
                    OracleDBConnectionInfo.DB_USER,
                    OracleDBConnectionInfo.DB_PASSWORD);
            return dbConnection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {

            // ??? i need to find out about this line code ???
            Locale.setDefault(defaultLocale);
        }

        return dbConnection;
    }

    public void closeDBConnection (Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            Locale.setDefault(defaultLocale);
        }
    }

    public static void main(String[] args) {
        Connection dbConnection = new OracleDB().getDBConnection();
    }
}
