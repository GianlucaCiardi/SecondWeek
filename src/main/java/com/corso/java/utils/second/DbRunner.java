package com.corso.java.utils.second;

import com.corso.java.utils.second.DbAccess;

import java.sql.SQLException;



public class DbRunner {

    public static void main(String[] args) throws SQLException {

        DbAccess dbAccess = new DbAccess();
        dbAccess.readDatabase();
    }
}