package Lv1.문자열_나누기;

public class Solution {
	public int solution(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			int xCount = 1;
			int noXCount = 0;
			while (xCount != noXCount) {
				if (++i >= s.length()) break;
				if (x == s.charAt(i)) xCount++;
				else noXCount++;
			}
			count++;
		}
		return count;
	}
}