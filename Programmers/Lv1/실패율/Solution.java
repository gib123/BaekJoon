package Lv1.실패율;

import java.util.*;

class Stage {
	int no;
	double failPct;

	public Stage (int no, double failPct) {
		this.no = no;
		this.failPct = failPct;
	}
}

public class Solution {
	public int[] solution(int N, int[] stages) {
		int[] stayedN = new int[N + 2];
		for (int i = 0; i < stages.length; i++) {
			stayedN[stages[i]]++;
		}
		int[] arrivedN = new int[N + 1];
		for (int i = 2; i < stayedN.length; i++) {
			for (int j = 1; j < i; j++) {
				arrivedN[j] += stayedN[i];
			}
		}
		Stage[] failed = new Stage[N];
		for (int i = 0; i < failed.length; i++) {
			int totalN = arrivedN[i + 1] + stayedN[i + 1];
			failed[i] = new Stage(i + 1, (totalN == 0) ? 0 : (double)stayedN[i + 1] / totalN);
		}
		Arrays.sort(failed, new Comparator<>() {
			@Override
			public int compare(Stage o1, Stage o2) {
				if (o1.failPct == o2.failPct) {
					return o1.no - o2.no;
				}
				return Double.compare(o1.failPct, o2.failPct) * -1;
			}
		});
		int[] answer = new int[N];
		for (int i = 0; i < N; i++) {
			answer[i] = failed[i].no;
		}
		return answer;
	}
}