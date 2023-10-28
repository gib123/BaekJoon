package Lv1.로또의_최고_순위와_최저_순위;

public class Solution {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		boolean[] win_bols = new boolean[46];
		for (int i = 0; i < win_nums.length; i++) {
			win_bols[win_nums[i]] = true;
		}
		int numCount = 0;
		int zeroCount = 0;
		for (int i = 0; i < lottos.length; i++) {
			if (win_bols[lottos[i]]) numCount++;
			if (lottos[i] == 0) zeroCount++;
		}
		int[] rank = {6, 6, 5, 4, 3, 2, 1};
		return new int[] {rank[numCount + zeroCount], rank[numCount]};
	}
}