package Lv1.같은_숫자는_싫어;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            if (al.get(al.size() - 1) != arr[i]) {
                al.add(arr[i]);
            }
        }
        int[] answer = new int[al.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = al.get(i);
        }
        return answer;
    }
}