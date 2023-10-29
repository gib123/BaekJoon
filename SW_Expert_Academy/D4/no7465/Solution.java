package D4.no7465;

import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			ArrayList<Integer>[] relation = new ArrayList[N + 1];
			for (int i = 1; i < N + 1; i++) {
				relation[i] = new ArrayList<>();
			}
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				int f = Integer.parseInt(st.nextToken());
				int s = Integer.parseInt(st.nextToken());
				relation[f].add(s);
				relation[s].add(f);
			}
			int groupCount = 0;
			Queue<Integer> q = new ArrayDeque<>();
			boolean[] visited = new boolean[N + 1];
			for (int i = 1; i < N + 1; i++) {
				if (visited[i]) continue;
				q.offer(i);
				visited[i] = true;
				groupCount++;
				while (!q.isEmpty()) {
					int now = q.poll();
					for (int j = 0; j < relation[now].size(); j++) {
						if (visited[relation[now].get(j)]) continue;
						q.offer(relation[now].get(j));
						visited[relation[now].get(j)] = true;
					}
				}
			}

			System.out.println("#" + test_case + " " + groupCount);
		}
	}

}