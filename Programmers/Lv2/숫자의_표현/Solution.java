package Lv2.숫자의_표현;

public class Solution {
	public int solution(int n) {
		if (n == 1 || n == 2) return 1;
		int count = 0;
		int sum = 0;
		int startN = 1;
		for (int i = 1; i <= n / 2 + 2; i++) {
			if (sum < n) {
				sum += i;
			} else {
				if (sum == n) count++;
				i--;
				sum -= startN++;
			}
		}
		return count + 1;
	}
}