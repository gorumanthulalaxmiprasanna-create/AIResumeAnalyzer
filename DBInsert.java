import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CHITTY
 */
public class DBInsert {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/resume_analyzer",
                "root",
                "prasannamani@008"
            );

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO resumes (user_id, resume_text, ats_score, suggested_role, suggestions) VALUES (?, ?, ?, ?, ?)"
            );

            ps.setInt(1, 1);
            ps.setString(2, "Java developer with 2 years experience...");
            ps.setInt(3, 85);
            ps.setString(4, "Software Developer");
            ps.setString(5, "Improve DSA, Add Spring Boot project");

            ps.executeUpdate();

            System.out.println("Resume inserted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}
