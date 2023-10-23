package Lv1.추억_점수;

import java.util.*;

public class Solution {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		HashMap<String, Integer> nameMap = new HashMap<>();
		for (int i = 0; i < name.length; i++) {
			nameMap.put(name[i], yearning[i]);
		}
		int[] answer = new int[photo.length];
		for (int i = 0; i < photo.length; i++) {
			for (int j = 0; j < photo[i].length; j++) {
				Integer num = nameMap.get(photo[i][j]);
				answer[i] += ((num != null) ? num : 0);
			}
		}
		return answer;
	}
}