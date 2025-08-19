/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jdbcdemo;

import com.mycompany.services.QuestionService;
import java.sql.SQLException;

/**
 *
 * @author pnam
 */
public class Tester {

    public static void main(String[] args) throws SQLException {
        QuestionService s = new QuestionService();
        System.out.println(s.countQuestions());
        System.out.println(s.countQuestionsByCate(4));
        
        s.countQuestionsByAllCate().forEach(o -> System.out.printf("%d - %s - %d\n", o[0], o[1], o[2]));

    }
}
