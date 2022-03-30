package com.corso.java.utils.Utils;

import com.corso.java.utils.Utils.DBConstant;

import java.sql.*;

public class DBConnection {


    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {

            Class.forName(DBConstant.DB_MYSQL_URL).newInstance();
            connection = DriverManager.getConnection(DBConstant.DB_URL, DBConstant.DB_USER, DBConstant.DB_PASSWORD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(DBConstant.DB_SELECT_STUDENTE);
            ResultSetMetaData md = resultSet.getMetaData();

            while (resultSet.next()) {
                for (int i = 1; i <= md.getColumnCount(); i++) {
                    System.out.println(resultSet.getString(i));
                }
            }


        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } finally {
            close(resultSet, statement, connection);
        }

    }

    private static void close(ResultSet resultSet, Statement statement, Connection connection) throws SQLException {

        if (resultSet != null)
            resultSet.close();

        if (statement != null)
            statement.close();

        if (connection != null)
            connection.close();
    }
}