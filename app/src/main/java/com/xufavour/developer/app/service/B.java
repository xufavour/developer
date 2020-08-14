package com.xufavour.developer.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: xuyangyang
 * @Date: 2020/7/3
 */
@Component("B")
public class B {

    private String aString = "a";
    private int y = 1;

    @Autowired
    A a;
}
