/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pnam.repositories;

import com.pnam.pojo.User;

/**
 *
 * @author pnam
 */
public interface UserRepositiry {
    public User getUserByUsername(String username);
}
