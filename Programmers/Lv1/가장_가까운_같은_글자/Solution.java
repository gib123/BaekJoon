package Lv1.가장_가까운_같은_글자;

public class Solution {
	public int[] solution(String s) {
		int[] answer = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			int index = s.substring(0, i).lastIndexOf(s.charAt(i));
			answer[i] = (index == -1) ? index : i - index;
		}
		return answer;
	}
}