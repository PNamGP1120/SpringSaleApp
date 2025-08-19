/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.services;

import com.mycompany.jdbcdemo.JDBCUtils;
import com.mycompany.pojo.Choice;
import com.mycompany.pojo.Question;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pnam
 */
public class QuestionService {
    public List<Question> getQuestions(String kw) throws SQLException {
        try (Connection conn = JDBCUtils.getConn()) {
            CallableStatement stm = conn.prepareCall("{ CALL getQuestions(?) }");
            stm.setString(1, kw);
            ResultSet rs = stm.executeQuery();
            
            List<Question> ques = new ArrayList<>();
            while (rs.next()) {
                String id = rs.getString("id");
                String content = rs.getString("content");
                
                ques.add(new Question(id, content));
                
//                System.out.printf("%s - %s\n", id, content);
            }
            return ques;
        }
    }
    
    public List<Choice> getChoicesByQuestionId(String questionId) throws SQLException{
        try (Connection conn = JDBCUtils.getConn()) {
            CallableStatement stm = conn.prepareCall("{ CALL getChoicesByQuestionId(?) }");
            stm.setString(1, questionId);
            ResultSet rs = stm.executeQuery();
            
            List<Choice> choices = new ArrayList<>();
            while (rs.next()) {
                String id = rs.getString("id");
                String content = rs.getString("content");
                boolean correct = rs.getBoolean("is_correct");
                
                choices.add(new Choice(id, content, correct));
                
//                System.out.printf("%s - %s - %s\n", id, content, correct);
            }
            return choices;
        }
    }
    
    public int countQuestions() throws SQLException {
        try(Connection conn = JDBCUtils.getConn()){
            CallableStatement stm = conn.prepareCall("{ CALL countQuestions(?) }");
            stm.registerOutParameter(1, Types.INTEGER);
            stm.execute();
            return stm.getInt(1);
        }
    }
    
    public int countQuestionsByCate(int cateId) throws SQLException {
        try(Connection conn = JDBCUtils.getConn()){
            CallableStatement stm = conn.prepareCall("{ CALL countQuestionsByCate(?, ?) }");
            stm.setInt(1, cateId);
            stm.registerOutParameter(2, Types.INTEGER);
            stm.execute();
            return stm.getInt(2);
        }
    }
    
    public List<Object[]> countQuestionsByAllCate() throws SQLException {
        try(Connection conn = JDBCUtils.getConn()){
            CallableStatement stm = conn.prepareCall("{ CALL countQuestionsByAllCate() }");
            
            ResultSet rs = stm.executeQuery();
            List<Object[]> results = new ArrayList<>();
            
            while(rs.next()){
                results.add(new Object[]{
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getInt(3)
                });
            }
            
            return results;
        }
    }
}
