/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pnam.services.impl;

import com.pnam.pojo.Category;
import com.pnam.repositories.CategoryRepository;
import com.pnam.services.CategoryServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pnam
 */
@Service
public class CategoryServicesImpl implements CategoryServices{
    @Autowired
    private CategoryRepository cates;

    @Override
    public List<Category> getCates() {
        return this.cates.getCates();
    }

    @Override
    public Category getCateById(int id) {
        return this.cates.getCateById(id);
    }
    
}
