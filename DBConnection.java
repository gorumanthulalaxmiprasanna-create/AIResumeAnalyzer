/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.resumeanalyzer;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author CHITTY
 */
public class DBConnection {
    public static Connection getConnection() {

        Connection con = null;

        try {

            String url = "jdbc:mysql://localhost:3306/resume_analyzer";
            String user = "root";
            String password = "prasannamani@008";

            con = DriverManager.getConnection(url, user, password);

            System.out.println("Database Connected Successfully!");

        } catch (Exception e) {
            System.out.println(e);
        }

        return con;
    }
}
