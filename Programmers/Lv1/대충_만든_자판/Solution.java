package Lv1.대충_만든_자판;

import java.util.*;

public class Solution {
	public int[] solution(String[] keymap, String[] targets) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < keymap.length; i++) {
			for (int j = 0; j < keymap[i].length(); j++) {
				char ch = keymap[i].charAt(j);
				Integer count = map.get(ch);
				map.put(ch, (count == null) ? j + 1 : ((count > j + 1) ? j + 1 : count));
			}
		}
		int[] answer = new int[targets.length];
		for (int i = 0; i < targets.length; i++) {
			int totalCount = 0;
			for (int j = 0; j < targets[i].length(); j++) {
				Integer count = map.get(targets[i].charAt(j));
				if (count == null) {
					totalCount = -1;
					break;
				}
				totalCount += count;
			}
			answer[i] = totalCount;
		}
		return answer;
	}
}