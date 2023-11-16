package Lv1.신고_결과_받기;

import java.util.*;

class Solution {
	public int[] solution(String[] id_list, String[] report, int k) {
		HashMap<String, ArrayList<String>> reportList = new HashMap<>();
		HashMap<String, Integer> reporteeCount = new HashMap<>();
		HashMap<String, Integer> reporterCount = new HashMap<>();
		for (int i = 0; i < id_list.length; i++) {
			reportList.put(id_list[i], new ArrayList<>());
			reporteeCount.put(id_list[i], 0);
			reporterCount.put(id_list[i], 0);
		}
		for (int i = 0; i < report.length; i++) {
			StringTokenizer st = new StringTokenizer(report[i]);
			String reporter = st.nextToken();
			String reportee = st.nextToken();
			if (!reportList.get(reportee).contains(reporter)) {
				reportList.get(reportee).add(reporter);
				reporteeCount.put(reportee, reporteeCount.get(reportee) + 1);
			}
		}
		int[] answer = new int[id_list.length];
		for (int i = 0; i < id_list.length; i++) {
			if (reporteeCount.get(id_list[i]) >= k) {
				ArrayList<String> temp = reportList.get(id_list[i]);
				for (int j = 0; j < temp.size(); j++) {
					reporterCount.put(temp.get(j), reporterCount.get(temp.get(j)) + 1);
				}
			}
			answer[i] = reporterCount.get(id_list[i]);
		}
		return answer;
	}
}