package com.xufavour.developer.java.basics.polygon;

/**
 * @Author: xyy
 * @Date: 2020/9/17
 */
public class Polygon {

    int a = 1;

    Polygon(){
        System.out.println("before cal()");
        cal();
        System.out.println("after cal()");
    }

    void cal(){
        System.out.println("Polygon.cal()");
    }

    public static void main(String[] args) {
        new Polygon();
    }

    public boolean firstWillWin(int[] values) {
        // write your code here
        int len = values.length;
        int[] sum = new int[len + 1];
        int[][] dp = new int[len][len];

        sum[0] = 0;
        for(int i = 1; i <= len; i++){
            sum[i] = sum[i - 1] + values[i-1];
        }
        return false;
    }
}
