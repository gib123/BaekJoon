package Lv1.폰켓몬;

import java.util.*;

public class Solution {
	public int solution(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int num : nums) {
			set.add(num);
		}
		return (nums.length / 2 < set.size()) ? nums.length / 2 : set.size();
	}
}