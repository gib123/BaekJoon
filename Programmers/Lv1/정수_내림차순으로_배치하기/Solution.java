package Lv1.정수_내림차순으로_배치하기;

import java.util.*;
class Solution {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        String str = "";
        for (char c : arr) {
            str = (c - '0') + str;
        }
        return Long.parseLong(str);
    }
}