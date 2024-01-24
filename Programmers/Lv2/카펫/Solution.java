package Lv2.카펫;

public class Solution {
	public int[] solution(int brown, int yellow) {
		int a = brown + yellow;
		int b = (4 + brown) / 2;
		int w = (b + (int)Math.sqrt(b * b - 4 * a)) / 2;
		int h = a / w;
		return (w >= h) ? new int[] {w, h} : new int[] {h, w};
	}
}