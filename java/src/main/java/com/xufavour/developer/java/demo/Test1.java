package com.xufavour.developer.java.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xyy
 * @Date: 2020/10/14
 */
public class Test1 {

    public static void main(String[] args) {
        HashMap<String,Object> objectMap = new HashMap<>();
        objectMap.put("1","test");
        objectMap.put("2",2);
        System.out.println(objectMap.get("1").getClass());
        System.out.println(objectMap.get("2").getClass());
    }
}
