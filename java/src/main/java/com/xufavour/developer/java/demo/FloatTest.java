package com.xufavour.developer.java.demo;

/**
 * @Author: xyy
 */
public class FloatTest {

    public static void main(String[] args) {
        float a = 0.1f;
        float b = 0.2f;
        float c = a +b;
        System.out.println(Float.compare(0.3f,a+b));
        System.out.println(c-0.3f);

        System.out.println("===================");

        double a1 = 0.1;
        double b1 = 0.2;
        double c1 =a1 +b1;
        System.out.println(Double.compare(0.3d,c1));
        System.out.println(c1 -0.3);
        System.out.println(Math.pow(2,-54));
    }
}
