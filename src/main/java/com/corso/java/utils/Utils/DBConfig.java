package com.corso.java.utils.Utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {

    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "Tunonlasai31.";
    public static final String DB_URL = "jdbc:mysql://localhost/jdbc";
    public static final String DB_MYSQL_URL = "com.mysql.cj.jdbc.Driver";


    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(
                DBConfig.DB_URL, DBConfig.DB_USER, DBConfig.DB_PASSWORD);
    }

}

