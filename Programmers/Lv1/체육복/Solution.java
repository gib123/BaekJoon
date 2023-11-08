package Lv1.체육복;

import java.util.*;

public class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
		int[] student = new int[n + 2];
		int answer = n;
		for (int num : lost) {
			student[num]--;
		}
		for (int num : reserve) {
			student[num]++;
		}
		for (int i = 1; i < student.length; i++) {
			if (student[i] == -1) {
				if (student[i - 1] == 1) {
					student[i]++;
					student[i - 1]--;
				} else if (student[i + 1] == 1) {
					student[i]++;
					student[i + 1]--;
				} else {
					answer--;
				}
			}
		}
		return answer;
	}
}