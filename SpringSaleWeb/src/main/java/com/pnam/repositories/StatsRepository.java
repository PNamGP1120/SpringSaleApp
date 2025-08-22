/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pnam.repositories;

import java.util.List;

/**
 *
 * @author pnam
 */
public interface StatsRepository {

    public List<Object[]> getRevenueByProduct();

    public List<Object[]> getRevenueByTime(String time, int year);
}
