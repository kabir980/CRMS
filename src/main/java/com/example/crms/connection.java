package com.example.crms;

import java.sql.Connection;
//import java.sql.DatabaseMetaData;
//import static java.lang.Class.forName;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3308/crms";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "kabirpokhrel";

    public static Connection getConnection() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            return connection;

        } catch (ClassNotFoundException |
                 SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}

