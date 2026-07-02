/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

public class SuggestionService {

    public static String getSuggestions(String resume) {

        resume = resume.toLowerCase();

        String suggestions = "";

        if (!resume.contains("spring"))
            suggestions += "Learn Spring Boot. ";

        if (!resume.contains("git"))
            suggestions += "Learn Git & GitHub. ";

        if (!resume.contains("sql"))
            suggestions += "Improve SQL. ";

        if (!resume.contains("aws"))
            suggestions += "Learn Cloud (AWS). ";

        if (!resume.contains("projects"))
            suggestions += "Add more Projects. ";
        if (suggestions.isEmpty()) {
    suggestions = "Excellent Resume! No major improvements needed.";
}


        return suggestions;
    }
}