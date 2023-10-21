package Lv1.두_개_뽑아서_더하기;

import java.util.*;

public class Solution {
	public int[] solution(int[] numbers) {
		TreeSet set = new TreeSet();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (i != j) {
					set.add(numbers[i] + numbers[j]);
				}
			}
		}
		int[] answer = new int[set.size()];
		Iterator<Integer> it = set.iterator();
		int i = 0;
		while (it.hasNext()) {
			answer[i++] = it.next();
		}
		return answer;
	}
}