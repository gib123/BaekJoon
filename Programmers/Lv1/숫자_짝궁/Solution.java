package Lv1.숫자_짝궁;

public class Solution {
	public String solution(String X, String Y) {
		int[] XCounted = new int[10];
		for (int i = 0; i < X.length(); i++) {
			XCounted[X.charAt(i) - '0']++;
		}
		int[] dupN = new int[10];
		for (int i = 0; i < Y.length(); i++) {
			int index = Y.charAt(i) - '0';
			if (XCounted[index] > 0) {
				dupN[index]++;
				XCounted[index]--;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = dupN.length - 1; i >= 0; i--) {
			for (int j = 0; j < dupN[i]; j++) {
				sb.append(i);
			}
		}
		String answer = sb.toString();
		return answer.length() == 0 ? "-1" : ((answer.charAt(0) == '0') ? "0" : answer);
	}
}