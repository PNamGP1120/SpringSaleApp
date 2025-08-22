/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pnam.controllers;

import com.pnam.services.CategoryServices;
import com.pnam.services.ProductServices;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author pnam
 */
@Controller
@ControllerAdvice
public class IndexController {

    @Autowired
    private CategoryServices cate;
    @Autowired
    private ProductServices prodRepo;

    @ModelAttribute
    public void commonResponse(Model model) {
        model.addAttribute("categories", this.cate.getCates());
    }

    @RequestMapping("/")
    public String index(Model model, @RequestParam Map<String, String> params) {
        model.addAttribute("products", this.prodRepo.getProducts(params));
        return "index";
    }
}
