package edu.ntu.dp.controllers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseManager {
    private static Connection DbConnection;
    public static Connection getDbConnection() throws SQLException
    {
        DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        if (DbConnection == null) {
            DbConnection = DriverManager.getConnection(
                    "jdbc:sqlserver://WIN-O4H62SBL549;databaseName=StudentsJava;encrypt=false", "testuser1", "password1111"
            );
        }
        return DbConnection;
    }
}
