package D4.no1238;

import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int test_case = 1; test_case <= 10; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int L = Integer.parseInt(st.nextToken());
			int S = Integer.parseInt(st.nextToken());
			ArrayList<Integer>[] list = new ArrayList[101];
			for (int i = 0; i < list.length; i++) {
				list[i] = new ArrayList<>();
			}
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < L / 2; i++) {
				int from = Integer.parseInt(st.nextToken());
				int to = Integer.parseInt(st.nextToken());
				if (!list[from].contains(to)) {
					list[from].add(to);
				}
			}
			int max = Integer.MIN_VALUE;
			Queue<Integer> q = new ArrayDeque<>();
			boolean[] visited = new boolean[101];
			q.offer(S);
			visited[S] = true;
			while (!q.isEmpty()) {
				int qSize = q.size();
				int tempMax = Integer.MIN_VALUE;
				for (int i = 0; i < qSize; i++) {
					int rm = q.poll();
					for (int j = 0; j < list[rm].size(); j++) {
						int ele = list[rm].get(j);
						if (!visited[ele]) {
							q.offer(ele);
							visited[ele] = true;
							tempMax = Math.max(tempMax, ele);
						}
					}
				}
				if (tempMax != Integer.MIN_VALUE) {
					max = tempMax;
				}
			}
			System.out.println("#" + test_case + " " + max);
		}
	}
}