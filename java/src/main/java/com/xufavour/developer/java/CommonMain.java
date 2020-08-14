package com.xufavour.developer.java;

import java.util.HashMap;

public class CommonMain {

    private static final int COUNT_BITS = Integer.SIZE - 3;
    private static final int CAPACITY = (1 << COUNT_BITS) - 1;

    public static void main(String[] args) {
//        System.out.println(Integer.toBinaryString(-2));

        retry:
        for (int m = 0; m < 100; m++) {
            for (int n = 0; n < 100; n++) {
                System.out.println("m : " + m +", n : " + n);
                if(n == 1 ) {
                    continue retry;
                }
            }
        }
    }

}
