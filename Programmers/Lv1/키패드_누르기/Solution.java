package Lv1.키패드_누르기;

public class Solution {

	public String solution(int[] numbers, String hand) {
		String answer = "";
		int[][] dis = {{1, 0, 1, 2, 1, 2, 3, 2, 3, 4, 3, 4},
			{2, 1, 2, 1, 0, 1, 2, 1, 2, 3, 2, 3},
			{3, 2, 3, 2, 1, 2, 1, 0, 1, 2, 1, 2},
			{4, 3, 4, 3, 2, 3, 2, 1, 2, 1, 0, 1}};
		int[] finger = {10, 12};
		for (int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			if (num == 1 || num == 4 || num == 7) {
				answer += "L";
				finger[0] = num;
			} else if (num == 3 || num == 6 || num == 9) {
				answer += "R";
				finger[1] = num;
			} else {
				int row = (num == 0) ? 3 : (num - 1) / 3;
				int[] interval = {dis[row][(finger[0] == 0) ? 10 : finger[0] - 1], dis[row][(finger[1] == 0) ? 10 : finger[1] - 1]};
				if (interval[0] < interval[1] || (interval[0] == interval[1] && hand.equals("left"))) {
					answer += "L";
					finger[0] = num;
				} else {
					answer += "R";
					finger[1] = num;
				}
			}
		}        return answer;
	}
}