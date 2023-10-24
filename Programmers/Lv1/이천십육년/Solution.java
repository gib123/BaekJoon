package Lv1.이천십육년;

public class Solution {
	public String solution(int a, int b) {
		int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int num = 0;
		for (int i = 1; i < a; i++) {
			num += month[i];
		}
		String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		return week[(num + b - 1) % 7];
	}
}