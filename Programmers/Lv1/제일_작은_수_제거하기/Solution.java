package Lv1.제일_작은_수_제거하기;

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[] {-1};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        int[] answer = new int[arr.length - 1];
        for (int i = 0, j = 0; i < answer.length; i++, j++) {
            if (arr[j] == min) j++;
            answer[i] = arr[j];
        }
        return answer;
    }
}