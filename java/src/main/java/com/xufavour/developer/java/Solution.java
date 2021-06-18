package com.xufavour.developer.java;

import java.util.HashSet;

class Solution {

    //pwwkew
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int len = s.length();
        HashSet<Character> window = new HashSet<>();
        int ans = 0;
        int left = 0;
        for(int i = 0; i < len; i++){
            if(i != 0){
                window.remove(s.charAt(i-1));
            }
            while (left < len && !window.contains(s.charAt(left))){
                window.add(s.charAt(left));
                left++;
            }
            ans = Math.max(ans,window.size());
        }
        return ans;
    }
}
