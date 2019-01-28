/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author gbscode
 */
public class SQL {

    private static Connection conn = null;
    Statement stmt = null;
    ResultSet rst = null;
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    private static String DB_URL;

    public SQL() {
    }

    public static Connection getConnection(String Username, String Pwd) {
        try {
            DB_URL = "jdbc:mysql://localhost:3306/";
            System.out.println("DB URL : " + DB_URL);
            System.out.println("DB USER : " + Username);
            System.out.println("DB Pwd : " + Pwd);
            Class.forName(JDBC_DRIVER);
            System.out.println("connecting to db");
            conn = DriverManager.getConnection(DB_URL, Username, Pwd);
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
        return conn;
    }

    private static Connection getConnection() {
        return conn;
    }

    public ObservableList<String> getDatabaseList() {
        ObservableList<String> list = FXCollections.observableArrayList();
        String sql = "SHOW Databases;";
        try {
            stmt = getConnection().createStatement();
            rst = stmt.executeQuery(sql);
            while (rst.next()) {
                list.add(rst.getString(1));
            }
        } catch (Exception e) {
        }
        return list;
    }
}
