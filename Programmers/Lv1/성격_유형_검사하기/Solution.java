package Lv1.성격_유형_검사하기;

import java.util.*;

public class Solution {
	public String solution(String[] survey, int[] choices) {
		char[][] types = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
		HashMap<Character, Integer> scores = new HashMap<>();
		for (int i = 0; i < types.length; i++) {
			for (int j = 0; j < types[i].length; j++) {
				scores.put(types[i][j], 0);
			}
		}
		int[] rule = {0, 3, 2, 1, 0, 1, 2, 3};
		for (int i = 0; i < choices.length; i++) {
			int idx = (choices[i] >= 1 && choices[i] <= 3) ? 0 : 1;
			scores.put(survey[i].charAt(idx), scores.get(survey[i].charAt(idx)) + rule[choices[i]]);
		}
		String answer = "";
		for (int i = 0; i < types.length; i++) {
			answer += (scores.get(types[i][0]) >= scores.get(types[i][1])) ? types[i][0] : types[i][1];
		}
		return answer;
	}
}