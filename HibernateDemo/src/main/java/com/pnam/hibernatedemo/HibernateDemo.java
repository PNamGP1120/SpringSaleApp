/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pnam.hibernatedemo;

import com.pnam.pojo.Product;
import com.pnam.repositories.impl.CategoryRepositoryImpl;
import com.pnam.repositories.impl.ProductRepositoryImpl;
import com.pnam.repositories.impl.StatsRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author pnam
 */
public class HibernateDemo {

    public static void main(String[] args) {
        CategoryRepositoryImpl cates = new CategoryRepositoryImpl();
//        cates.getCates().forEach(c -> System.out.printf("%d - %s - %s\n", c.getId(), c.getName(), c.getDescription()));
        ProductRepositoryImpl pros = new ProductRepositoryImpl();
        
//        Map<String, String> params = new HashMap<>();
////        params.put("kw", "galaxy");
//        params.put("orderBy", "price");
//        params.put("page", "2");
//        pros.getProducts(params).forEach(p -> System.out.printf("%s - %d\n",p.getName(), p.getPrice()));
//        Product p = new Product();
//        p.setName("Realme C12");
//        p.setPrice(12333l);
//        p.setCategoryId(cates.getCateById(1));
//        
//        pros.addOrUpdate(p);
//        pros.getProducts(null).forEach(p2 -> System.out.printf("%s - %d\n",p2.getName(), p2.getPrice()));
        StatsRepositoryImpl stats = new StatsRepositoryImpl();
//        stats.getRevenueByProduct().forEach(p -> System.out.printf("%d - %s: %d\n", p[0], p[1], p[2]));
        stats.getRevenueByTime("MONTH", 2020).forEach(p -> System.out.printf("%d: %d\n", p[0], p[1]));
    }
}
