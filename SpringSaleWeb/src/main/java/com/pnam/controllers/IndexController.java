/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pnam.controllers;

import com.pnam.repositories.impl.CategoryRepositoryImpl;
import com.pnam.repositories.impl.ProductRepositoryImpl;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author pnam
 */
@Controller
public class IndexController {
    @Autowired
    private CategoryRepositoryImpl cate;
    @Autowired
    private ProductRepositoryImpl prodRepo;
    
    @RequestMapping("/")
    public String index(Model model, @RequestParam Map<String, String> params){
//        cate.getCates().forEach(action->System.out.println(action.getName()));
        model.addAttribute("categories", cate.getCates());
        model.addAttribute("products", prodRepo.getProducts(params));
        return "index";
    }
}
