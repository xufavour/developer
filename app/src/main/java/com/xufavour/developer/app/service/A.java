package com.xufavour.developer.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: xuyangyang
 * @Date: 2020/7/3
 */
@Component("A")
public class A {

    private String aString = "a";
    private int x = 1;

    @Autowired
    B b;

}
