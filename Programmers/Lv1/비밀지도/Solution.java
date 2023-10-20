package Lv1.비밀지도;

public class Solution {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		int[] map = new int[n];
		for (int i = 0; i < n; i++) {
			map[i] = arr1[i] | arr2[i];
		}

		String[] answer = new String[n];
		for (int i = 0; i < n; i++) {
			answer[i] = "";
			for (int j = 0; j < n; j++) {
				answer[i] = (((map[i]  % 2 == 0) || (map[i] == 0)) ? " " : "#") + answer[i];
				map[i] /= 2;
			}
		}
		return answer;
	}
}