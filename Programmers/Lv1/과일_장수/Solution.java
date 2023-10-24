package Lv1.과일_장수;

import java.util.*;

public class Solution {
	public int solution(int k, int m, int[] score) {
		Arrays.sort(score);
		int maxB = 0;
		for (int i = score.length; i >= m; i -= m) {
			maxB += score[i - m] * m;
		}
		return maxB;
	}
}