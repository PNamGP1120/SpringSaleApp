/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pnam.controllers;

import com.pnam.services.StatsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author pnam
 */
@Controller
public class StatsController {
    @Autowired
    private StatsServices statsServices;
    
    @GetMapping("/stats") // sudung preauthorize
    public String stats(Model model){
        model.addAttribute("revenues", statsServices.getRevenueByProduct());
        return "stats";
    }
    
//    public String stats(Model model, @RequestParam String time, @RequestParam int year){
//        model.addAttribute("RevenueByProduct", statsServices.getRevenueByProduct());
//        model.addAttribute("RevenueByTime", statsServices.getRevenueByTime(time, year));
//        return "stats";
//    }
}
