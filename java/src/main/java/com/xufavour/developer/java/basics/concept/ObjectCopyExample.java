package com.xufavour.developer.java.basics.concept;

/**
 * @Author: xufavour
 * @Date: 2020/5/25
 */
public class ObjectCopyExample {


    public static void main(String[] args) {
        double sqrt = Math.sqrt(2);
        System.out.println(sqrt);
        System.out.println(mySqrt(2));
        
    }

    public static double delta = 0.000000000001;
    public static double mySqrt(double x){
        double start = 1;
        double end = x;
        int c = 0;
        while (true){
            c ++;
            double mid = (start + end)/2;
            if(Math.abs(mid * mid - x) < delta ){
                System.out.println(c);
                return mid;
            }
            if(mid * mid > x){
                end = mid;
            }else if(mid * mid < x){
                start = mid;
            }
        }
    }
}
