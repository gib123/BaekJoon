package Lv1.달리기_경주;

import java.util.*;

class Solution {
	public String[] solution(String[] players, String[] callings) {
		HashMap<String, Integer> pMap = new HashMap<>();
		for (int i = 0; i < players.length; i++) {
			pMap.put(players[i], i);
		}
		for (int i = 0; i < callings.length; i++) {
			int rank = pMap.get(callings[i]);
			String temp = players[rank - 1];
			players[rank - 1] = callings[i];
			players[rank] = temp;
			pMap.put(callings[i], rank - 1);
			pMap.put(temp, rank);
		}
		return players;
	}
}