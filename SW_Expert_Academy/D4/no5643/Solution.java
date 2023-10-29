package D4.no5643;

import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			int M = Integer.parseInt(br.readLine());
			int[][] arr = new int[N + 1][N + 1];
			int[] countArr = new int[N + 1];
			for (int i = 0; i < M; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				arr[a][b] = 1;
				arr[b][a] = -1;
			}
			for (int i = 1; i < N + 1; i++) {
				Stack<Integer> s = new Stack<>();
				s.push(i);
				while (!s.isEmpty()) {
					int now = s.pop();
					for (int j = 1; j < N + 1; j++) {
						if (arr[now][j] == 0) continue;
						if ((arr[i][now] == 1 || i == now) && arr[now][j] == 1) {
							if (arr[i][j] == 0 || i == now) {
								s.push(j);
								countArr[i]++;
							}
							arr[i][j] = 1;
						}
						if ((arr[i][now] == -1 || i == now) && arr[now][j] == -1) {
							if (arr[i][j] == 0 || i == now) {
								s.push(j);
								countArr[i]++;
							}
							arr[i][j] = -1;
						}
					}
				}
			}
			int count = 0;
			for (int i = 1; i < N + 1; i++) {
				if (countArr[i] == N - 1) count++;
			}
			System.out.println("#" + test_case + " " + count);
		}
	}
}