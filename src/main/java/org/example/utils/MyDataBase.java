package org.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDataBase {

    private static MyDataBase instance;
    private final String USER = "root";
    private final String PASSWORD = "";
    private final String URL = "jdbc:mysql://127.0.0.1:3306/esprit";
    private Connection cnx;

    private MyDataBase() {
        try {
            cnx = DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("ok (y)");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("erreur de connection ...");
        }
    }

    public static MyDataBase getInstance() {
        if (instance == null) {
            instance = new MyDataBase();
        }
        return instance;
    }

    public Connection getCnx() {
        return cnx;
    }


}
