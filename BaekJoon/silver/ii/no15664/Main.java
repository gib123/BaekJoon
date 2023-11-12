package silver.ii.no15664;

import java.io.*;
import java.util.*;

class Main {
	static int M;
	static int[] nums;
	static StringBuilder sb = new StringBuilder();

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		nums = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nums);
		recur(0, 0, 0);
		System.out.print(sb);
	}

	public static void recur(int m, int start, int flag) {
		if (m == M) {
			for (int i = 0; i < nums.length; i++) {
				if ((flag & 1 << i) > 0) {
					sb.append(nums[i] + " ");
				}
			}
			sb.append("\n");
			return;
		}
		for (int i = start; i < nums.length; i++) {
			if (i > start && (nums[i - 1] == nums[i])) continue;
			recur(m + 1, i + 1, flag | 1 << i);
		}
	}
}