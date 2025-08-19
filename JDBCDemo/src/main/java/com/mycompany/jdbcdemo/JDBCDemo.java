/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.jdbcdemo;

import com.mycompany.pojo.Question;
import com.mycompany.services.QuestionService;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pnam
 */
public class JDBCDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        QuestionService s = new QuestionService();
        List<Question> ques = s.getQuestions("");

        for (var q : ques) {
            System.out.println(q.getContent());
            q.setChoices(s.getChoicesByQuestionId(q.getId()));

            for (int i = 0; i < q.getChoices().size(); i++) {
                System.out.printf("%d - %s\n", i + 1, q.getChoices().get(i).getContent());
            }

            System.out.print("Your choice (1 -> 4): ");
            int c = sc.nextInt();

            if (q.getChoices().get(c - 1).isCorrect()) {
                System.out.println("Exactly");
            } else {
                System.out.println("Wrongly");
            }
        }
    }
}
