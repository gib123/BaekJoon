package Lv2.피보나치_수;

public class Solution {
	public int solution(int n) {
		int[] sum = new int[n + 1];
		sum[0] = 0;
		sum[1] = 1;
		for (int i = 2; i <= n; i++) {
			sum[i] = sum[i - 1] % 1234567 + sum[i - 2] % 1234567;
		}
		return sum[n] % 1234567;
	}
}