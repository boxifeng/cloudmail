package com.becc.shopping.cloudmail.service;

import org.springframework.stereotype.Service;

@Service
public class ShoppingService {
    public String getItem(){
        System.out.println("执行");
        return "获得商品";
    }
}
