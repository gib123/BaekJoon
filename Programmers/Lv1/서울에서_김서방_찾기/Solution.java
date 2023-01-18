package Lv1.서울에서_김서방_찾기;

import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
    }
}