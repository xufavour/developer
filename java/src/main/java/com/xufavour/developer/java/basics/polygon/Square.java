package com.xufavour.developer.java.basics.polygon;

import java.util.Optional;

/**
 * @Author: xyy
 * @Date: 2020/9/17
 */
public class Square extends Polygon {

    private final int border;

    Square(int i) {
        border = i;
        System.out.println("Square con border = " + border);
    }

    @Override
    void cal() {
        System.out.println("Square.cal() border= " + border);
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(paper(4));
    }

    /*
              0
      0       0       1
  0   0   1   0   0   1   1
0 0 1 0 0 1 1 0 0 0 1 1 0 1 1
     */

    public static String paper(int n) {
        String mid = "0";
        while (n > 1) {
            n--;
            char[] array = mid.toCharArray();
            StringBuilder tmp = new StringBuilder("0");
            String flag = "1";
            for (int i = 0; i < array.length; i++){
                tmp = tmp.append(array[i]).append(flag);
                flag = flag.equals("0") ? "1" : "0";
            }
            mid = tmp.toString();
        }
        return mid;
    }
}