package Lv1.기사단원의_무기;

public class Solution {
	public int solution(int number, int limit, int power) {
		int weight = 1;
		for (int i = 2; i <= number; i++) {
			int num = 2;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					num += ((j * j == i) ? 1 : 2);
				}
			}
			weight += ((num > limit) ? power : num);
		}
		return weight;
	}
}