/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pnam.services;

import com.pnam.pojo.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author pnam
 */
public interface UserServices extends UserDetailsService{
    User getUserByUsername(String username);
}
