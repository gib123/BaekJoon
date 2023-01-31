package Lv1.나누어_떨어지는_숫자_배열;

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int e : arr) {
            if (e % divisor == 0) tmp.add(e);
        }
        if (tmp.size() == 0) return new int[] {-1};
        Collections.sort(tmp);
        int[] answer = new int[tmp.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = tmp.get(i);
        }
        return answer;
    }
}