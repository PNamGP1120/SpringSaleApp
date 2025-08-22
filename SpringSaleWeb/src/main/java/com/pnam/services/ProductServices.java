/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pnam.services;

import com.pnam.pojo.Product;
import java.util.List;
import java.util.Map;

/**
 *
 * @author pnam
 */
public interface ProductServices {

    List<Product> getProducts(Map<String, String> params);

    void addOrUpdate(Product p);

    void deleteProduct(int id);

    Product getProductById(int id);
}
