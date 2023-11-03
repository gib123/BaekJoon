package Lv1.햄버거_만들기;

import java.util.*;

public class Solution {
	public int solution(int[] ingredient) {
		int answer = 0;
		int[] stack = new int[ingredient.length];
		int top = -1;
		for (int in : ingredient) {
			stack[++top] = in;
			if (top >= 3) {
				if (stack[top - 3] == 1 && stack[top - 2] == 2 && stack[top - 1] == 3 && stack[top] == 1) {
					answer++;
					top -= 4;
				}
			}
		}
		return answer;
	}
}