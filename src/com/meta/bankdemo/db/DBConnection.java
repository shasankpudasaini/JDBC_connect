package com.meta.bankdemo.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    Connection connection = null;

    public DBConnection() {
        if (connection ==null){

            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String username = "root";
            String password = "root";
            int port = 3307;


            String databaseName = "sample_db";
            String url = "jdbc:mysql://localhost:"+port+"/" + databaseName;

                connection = DriverManager.getConnection(url,username,password);
            } catch (Exception ex) {
                System.out.println("Database connection failed");
                ex.printStackTrace();
            }
        }}
}
