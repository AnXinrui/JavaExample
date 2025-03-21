package com.axr.exercise;

/**
 * @author xinrui.an
 * @date 2025/03/17
 */
public class Solution1963 {
    public int minSwaps(String s) {
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == '['  || cnt == 0) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return cnt / 2;
    }
}