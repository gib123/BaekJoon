package Lv1.크레인_인형뽑기_게임;

import java.util.*;

public class Solution {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer>[] screen = new Stack[board[0].length];
		for (int i = 0; i < screen.length; i++) {
			screen[i] = new Stack<>();
			for (int j = board.length - 1; j >= 0; j--) {
				if (board[j][i] != 0) {
					screen[i].add(board[j][i]);
				}
			}
		}
		Stack<Integer> basket = new Stack<>();
		for (int i = 0; i < moves.length; i++) {
			if (screen[moves[i] - 1].size() == 0) continue;
			int num = screen[moves[i] - 1].pop();
			if (basket.size() > 0 && basket.peek() == num) {
				basket.pop();
				answer += 2;
			} else {
				basket.add(num);
			}
		}
		return answer;
	}
}