package Lv1.완주하지_못한_선수;

import java.util.*;

public class Solution {
	public String solution(String[] participant, String[] completion) {
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < completion.length; i++) {
			Integer num = map.get(completion[i]);
			map.put(completion[i], (num != null) ? num + 1 : 1);
		}
		String answer = "";
		for (int i = 0; i < participant.length; i++) {
			Integer num = map.get(participant[i]);
			if (num == null || num == 0) {
				answer = participant[i];
				break;
			}
			map.put(participant[i], num - 1);
		}
		return answer;
	}
}