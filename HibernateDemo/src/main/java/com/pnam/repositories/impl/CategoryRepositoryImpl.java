/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pnam.repositories.impl;

import com.pnam.hibernatedemo.HibernateUtils;
import com.pnam.pojo.Category;
import jakarta.persistence.Query;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author pnam
 */
public class CategoryRepositoryImpl {
    public List<Category> getCates(){
        try (Session s = HibernateUtils.getFACTORY().openSession()){
            Query q = s.createQuery("FROM Category", Category.class);
            return q.getResultList();
        }
    }
    
    public Category getCateById(int id){
        try (Session s = HibernateUtils.getFACTORY().openSession()){
            return s.find(Category.class, id);
        }
    }
}
