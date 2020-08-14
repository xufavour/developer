package com.xufavour.developer.java.cocurrent.juc;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: xuyangyang
 * @Date: 2020/7/5
 */
public class ConcurrentMapExample {


    public static void main(String[] args) {
        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("test","test");

    }
}
