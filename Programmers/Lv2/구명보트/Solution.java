package Lv2.구명보트;

import java.util.*;

public class Solution {
	public int solution(int[] people, int limit) {
		Arrays.sort(people);
		int count = 0;
		for (int minIdx = 0, maxIdx = people.length - 1; minIdx <= maxIdx; maxIdx--, count++) {
			if (limit - people[maxIdx] >= people[minIdx]) minIdx++;
		}
		return count;
	}
}