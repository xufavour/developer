package com.xufavour.developer.math.algorithm.sort;

/**
 * @Author: favour
 */
public class BubbleSort {

    public static void main(String[] args) {
        sort(null);
    }

    public static void sort(int[] array) {
        if (array == null) {
            return;
        }
        int len = array.length;
        for (int m = 0; m < len; m++) {
            boolean flag = false;
            for (int i = 0; i < len - 1 - m; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    public void insertSort(int[] array) {
        int len = array.length;
        for (int i = 1; i < len; i++) {
            int tmp = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (tmp < array[j]) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j] = tmp;
        }
    }

}
