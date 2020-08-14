package com.xufavour.developer.java.cocurrent;

/**
 * @Author: xuyangyang
 * @Date: 2020/6/18
 */
public class ThreadLocalExample {


    ThreadLocal<LocalVariable> threadLocal = new ThreadLocal<>();
    ThreadLocal<String> test = new ThreadLocal<>();
    public static void main(String[] args) {
        ThreadLocalExample example = new ThreadLocalExample();
        example.threadLocal.set(new LocalVariable());
        example.test.set("test");
        example.threadLocal = null;
        example.test.get();
    }
}
