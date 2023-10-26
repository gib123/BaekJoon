package Lv1.소수_찾기;

public class Solution {
	public int solution(int n) {
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (!isPrime(i)) count++;
		}
		return count;
	}

	public boolean isPrime(int num) {
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) return true;
		}
		return false;
	}
}