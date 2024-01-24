package Lv2.영어_끝말잇기;

import java.util.*;

public class Solution {
	public int[] solution(int n, String[] words) {
		HashSet<String> memory = new HashSet<>();
		int seq = 1;
		int count = 1;
		for (int i = 0; i < words.length; i++, seq++) {
			if (memory.contains(words[i]) ||
				(i > 0 && words[i - 1].charAt(words[i - 1].length() - 1)
					!= words[i].charAt(0))) {
				return new int[] {seq, count};
			}
			if (seq == n) {
				count++;
				seq = 0;
			}
			memory.add(words[i]);
		}
		return new int[] {0, 0};
	}
}