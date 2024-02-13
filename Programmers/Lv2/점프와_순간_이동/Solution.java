package Lv2.점프와_순간_이동;

public class Solution {
	public int solution(int n) {
		int count = 0;
		while (n > 0) {
			if (n % 2 != 0) {
				n--;
				count++;
			}
			n /= 2;
		}
		return count;
	}
}