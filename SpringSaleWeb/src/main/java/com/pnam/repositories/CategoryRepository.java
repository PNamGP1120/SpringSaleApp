/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pnam.repositories;

import com.pnam.pojo.Category;
import java.util.List;

/**
 *
 * @author pnam
 */
public interface CategoryRepository {

    List<Category> getCates();

    Category getCateById(int id);
}
