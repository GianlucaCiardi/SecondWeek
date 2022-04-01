package com.corso.java.utils.Olympic;

import com.corso.java.utils.Utils.DBConfig;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {

    private final static String CREATE_DB_DDL =
            "CREATE TABLE Athletes ("
                    + "id SERIAL NOT NULL PRIMARY KEY,"
                    + "name VARCHAR(255), surname VARCHAR(255))";

    public static void main(String[] args) throws SQLException {
        try (Connection con = DBConfig.connect()) {

            try (Statement stmt = con.createStatement()) {
                //Esegue la query
                stmt.executeUpdate(CREATE_DB_DDL);
            }
        }
    }
}