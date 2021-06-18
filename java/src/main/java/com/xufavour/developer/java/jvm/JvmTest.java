package com.xufavour.developer.java.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xyy
 */
public class JvmTest {

    static int size = 1024 * 1024;
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000);
        List<Obj> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new Obj());
            Thread.sleep(2000);
        }
    }
}
class Obj{
    static int[] array = new int[1024 * 1024];
}
