package com.corso.java.utils.second;

import java.sql.SQLException;



public interface Db<K> {

    void readDatabase() throws SQLException;

    void close() throws SQLException;
    //void writeResult(K result);
}