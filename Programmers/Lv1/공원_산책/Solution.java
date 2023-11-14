package Lv1.공원_산책;
import java.util.*;

class Solution {
	public int[] solution(String[] park, String[] routes) {
		int[] start = new int[2];
		for (int i = 0; i < park.length; i++) {
			for (int j = 0; j < park[i].length(); j++) {
				if (park[i].charAt(j) == 'S') start = new int[] {i, j};
			}
		}
		HashMap<Character, int[]> move = new HashMap<>();
		move.put('E', new int[] {0, 1});
		move.put('W', new int[] {0, -1});
		move.put('S', new int[] {1, 0});
		move.put('N', new int[] {-1, 0});
		for (int i = 0; i < routes.length; i++) {
			int[] dir = move.get(routes[i].charAt(0));
			int count = routes[i].charAt(2) - '0';
			int[] tmp = {start[0], start[1]};
			boolean stop = false;
			for (int j = 0; j < count; j++) {
				tmp[0] += dir[0];
				tmp[1] += dir[1];
				if (tmp[0] < 0 || tmp[0] >= park.length || tmp[1] < 0 || tmp[1] >= park[0].length() || park[tmp[0]].charAt(tmp[1]) == 'X') {
					stop = true;
					break;
				}
			}
			if (!stop) {
				start[0] = tmp[0];
				start[1] = tmp[1];
			}
		}
		return start;
	}
}