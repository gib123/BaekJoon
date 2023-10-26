package Lv1.소수_만들기;

public class Solution {

	public int solution(int[] nums) {
		return countPrime(0, nums, 0, 0, 0);
	}

	public int countPrime(int n, int[] nums, int start, int sum, int count) {
		if (n == 3) {
			return (!isPrime(sum)) ? count + 1 : count;
		}
		for (int i = start; i < nums.length; i++) {
			count = countPrime(n + 1, nums, i + 1, sum + nums[i], count);
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