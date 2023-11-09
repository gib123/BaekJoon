package Lv1.개인정보_수집_유효기간;

import java.util.*;

public class Solution {
	public int[] solution(String today, String[] terms, String[] privacies) {
		int todays = getDay(today);
		HashMap<Character, Integer> termsMap = new HashMap<>();
		for (String t : terms) {
			StringTokenizer st = new StringTokenizer(t);
			termsMap.put(st.nextToken().charAt(0), Integer.parseInt(st.nextToken()) * 28);
		}
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < privacies.length; i++) {
			StringTokenizer st = new StringTokenizer(privacies[i]);
			if (todays >= getDay(st.nextToken()) + termsMap.get(st.nextToken().charAt(0))) {
				ans.add(i + 1);
			}
		}
		int[] answer = new int[ans.size()];
		for (int i = 0; i < ans.size(); i++) {
			answer[i] = ans.get(i);
		}
		return answer;
	}

	public int getDay(String date) {
		StringTokenizer st = new StringTokenizer(date, ".");
		int[] dates = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		return (dates[0] - 1) * 12 * 28 + (dates[1] - 1) * 28 + dates[2];
	}
}