package com.xufavour.developer.math.algorithm;

/**
 * @Author: xyy
 * @Date: 2020/8/14
 */
public class MatchChar {


    public static int kmp(String str, String pattern) {

        return 0;
    }

    private static int[] getNextArray(String pattern){
        int[] next = new int[pattern.length()];
        int j = 0;
        for(int i = 2; i< pattern.length(); i++){
            while (j != 0 && pattern.charAt(j) != pattern.charAt(i-1)){
                //从next[i+1]的求解回溯到 next[j]
                j = next[j];
            }
            if(pattern.charAt(j) == pattern.charAt(i-1)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }

    public static void main(String[] args) {

    }
}
