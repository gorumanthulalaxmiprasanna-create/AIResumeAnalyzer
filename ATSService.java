/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
public class ATSService {

    public static int calculateScore(String resume) {

        resume = resume.toLowerCase();

        String[] skills = {
            "java","python","sql","spring",
            "html","css","javascript","git","aws"
        };

        int score = 0;

        for (String s : skills) {
            if (resume.contains(s)) {
                score += 10;
            }
        }

        return Math.min(score, 100);
    }
/**
 *
 * @author CHITTY
 */

    
}
