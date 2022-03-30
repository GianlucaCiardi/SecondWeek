package com.corso.java.utils.Supplier;


import com.corso.java.utils.Utils.LOG;
import com.corso.java.utils.Utils.DBConstant;

import java.sql.*;

public class SupplierRunner {

    static String[] SQLData = {
            "('001', 'Ladroni', 'Via Ostense', 'Roma')",
            "('002', 'Risparmietti', 'Viale Marconi', 'Roma')",
            "('010', 'Teloporto',    'Via Roma','Milano')"
    };

    private static Connection connection;
    private static Statement statement;
    private static final LOG L = LOG.getInstance();

    public static void main(String[] args) throws SQLException {

        try {
            Class.forName(DBConstant.DB_MYSQL_URL).newInstance();


            connection = DriverManager.getConnection(DBConstant.DB_URL, DBConstant.DB_USER, DBConstant.DB_PASSWORD);
            statement = connection.createStatement();

            L.debug(connection.getMetaData().getTypeInfo().toString());

            statement.executeUpdate("CREATE TABLE IF NOT EXISTS `JDBC`.`Fornitori` (\n" +
                    "  `CodiceFornitore` INT NOT NULL,\n" +
                    "  `nome` VARCHAR(20) NULL,\n" +
                    "  `indirizzo` VARCHAR(20) NULL,\n" +
                    "  `citta` VARCHAR(20) NULL,\n" +
                    "  PRIMARY KEY (`CodiceFornitore`));\n");

            insert();

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    public static void insert() {
        try {
            statement = connection.createStatement();
            int iRowCount = 0;
            for (String sql : SQLData) {
                iRowCount += statement.executeUpdate(
                        "INSERT INTO Fornitori VALUES " + sql);
            }
            L.info(iRowCount + " righe inserite nalla tabella Fornitori.");
            statement.close();
            connection.close();
        } catch (SQLException exQuery) {
            System.err.println("Errore nell'interrogazione.");
        }
    }

    // da completare
    public static boolean isTableExist(String sTablename) throws SQLException {
        if (connection != null) {
            DatabaseMetaData dbmd = connection.getMetaData();
            ResultSet rs = dbmd.getTables(null, null, sTablename, null);
            if (rs.next()) {
                System.out.println("Table " + rs.getString("TABLE_NAME") + "already exists !!");
            } else {
                System.out.println("Write your create table function here !!!");
            }
            return true;
        }
        return false;
    }
}