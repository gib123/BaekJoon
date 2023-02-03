package Lv1.문자열_내림차순으로_배치하기;

import java.util.*;

class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        return String.join("", str);
    }
}