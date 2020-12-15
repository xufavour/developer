package com.xufavour.developer.math.algorithm;

/**
 * @Author: xyy
 * @Date: 2020/8/17
 */
public class BaseSort {

    public static void main(String[] args) {

        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.arch"));
    }


    public static void bubbleSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSort2(int[] array) {
        int tempPostion = 0;
        int len = array.length -1;
        for (int i = 1; i < array.length; i++) {
            boolean flag = true;
            for (int j = 0; j < len; j++) {
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = false;
                    tempPostion = j;
                }
            }
            len = tempPostion;
            if(flag){
                return;
            }
        }
    }


}
