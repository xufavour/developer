package com.xufavour.developer.java.basics.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author: favour
 */
public class Example {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("李四","张三","张威武");
        list.stream()
                .filter(s -> {
                    System.out.println(s);
                    return s.startsWith("张");
                }).filter(s -> {
            System.out.println(s);
                    return s.length() > 1;
        }).forEach(s-> System.out.println(s));

    }
}
