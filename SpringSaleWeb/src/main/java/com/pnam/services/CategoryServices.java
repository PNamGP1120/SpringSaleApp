/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pnam.services;

import com.pnam.pojo.Category;
import java.util.List;

/**
 *
 * @author pnam
 */
public interface CategoryServices {
    
    List<Category> getCates();

    Category getCateById(int id);
}
