package Lv1.모의고사;

import java.util.*;

public class Solution {
	public ArrayList<Integer> solution(int[] answers) {
		int[] score = new int[3];
		int[][] num = { {1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
		int[] idx = new int[3];
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == num[0][idx[0]++]) score[0]++;
			if (answers[i] == num[1][idx[1]++]) score[1]++;
			if (answers[i] == num[2][idx[2]++]) score[2]++;
			if (idx[0] >= num[0].length) idx[0] = 0;
			if (idx[1] >= num[1].length) idx[1] = 0;
			if (idx[2] >= num[2].length) idx[2] = 0;
		}
		int max = Math.max(Math.max(score[0], score[1]), score[2]);
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < score.length; i++) {
			if (max == score[i]) ans.add(i + 1);
		}
		return ans;
	}
}