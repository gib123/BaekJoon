package Lv1.다트_게임;

public class Solution {
	public int solution(String dartResult) {
		int[] scores = new int[3];
		int s = 0;
		int preN = 0;
		int num = 0;
		for (int i = 0; i < dartResult.length(); i++) {
			char now = dartResult.charAt(i);
			while (now >= '0' && now <= '9') {
				if (i > 0 && (dartResult.charAt(i - 1) < '0' || dartResult.charAt(i - 1) > '9')) {
					num = 0;
					scores[s++] = preN;
				}
				num = num * 10 + (now - '0');
				now = dartResult.charAt(++i);
			}
			num = (int)Math.pow(num, (now == 'D') ? 2 : ((now == 'T') ? 3 : 1));
			System.out.println(num);
			num *= (now == '*') ? 2 : ((now == '#') ? -1 : 1);
			if (s != 0) scores[s - 1] *= (now == '*') ? 2 : 1;
			preN = num;
		}
		scores[2] = preN;
		return scores[0] + scores[1] + scores[2];
	}
}