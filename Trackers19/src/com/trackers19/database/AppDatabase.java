package com.trackers19.database;

import com.trackers19.common.Utilities;
import com.trackers19.models.Teacher;
import com.trackers19.models.User;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class AppDatabase {
    public final String dbName = "trackers19.db";
    private Connection dbConnection;

    public AppDatabase() throws Exception {
        // Check database connection & create database if not exists
        Connection dbConnection = getDbConnection();
        if (dbConnection == null)
            throw new Exception("Failed to initialize database ");
    }

    public Connection getDbConnection() {
        Connection dbConnection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            dbConnection = DriverManager.getConnection("jdbc:sqlite:" + dbName);
            dbConnection.setAutoCommit(true);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return dbConnection;
    }

    public boolean executeStatement(String sql) {
        int results = -1;
        Connection dbConnection = null;
        Statement stmt = null;

//        System.out.println("### Executing statement: \n" + sql);
        try {
            dbConnection = getDbConnection();
            stmt = dbConnection.createStatement();
            results = stmt.executeUpdate(sql);
            stmt.close();
            dbConnection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return results != -1;
    }
//
//    public ResultSet selectStatement(String query) {
//        ResultSet result = null;
//        Connection dbConnection = null;
//
//        try {
//            dbConnection = getDbConnection();
//            result = dbConnection.createStatement().executeQuery(query);
//            dbConnection.close();
//        } catch (Exception e) {
//            System.err.println(e.getClass().getName() + ": " + e.getMessage());
//            System.exit(0);
//        }
//        return result;
//    }


}
