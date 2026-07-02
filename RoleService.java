/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

public class RoleService {

    public static String getRole(String resume) {

        resume = resume.toLowerCase();

        if (resume.contains("java") && resume.contains("spring")) {
            return "Java Developer";
        }

        else if (resume.contains("python") && resume.contains("data")) {
            return "Data Engineer";
        }

        else if (resume.contains("html") || resume.contains("css")) {
            return "Frontend Developer";
        }

        else {
            return "Software Developer";
        }
    }
}
