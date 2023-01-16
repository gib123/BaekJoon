package Lv1.평균_구하기;

import java.util.*;

class Solution {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
}