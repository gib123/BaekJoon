package Lv2.다음_큰_숫자;

public class Solution {
	public int solution(int n) {
		int num = Integer.bitCount(n);
		while (true) {
			if (Integer.bitCount(++n) == num) break;
		}
		return n;
	}
}