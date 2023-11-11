package silver.iii.no15656;

import java.io.*;
import java.util.*;

public class Main {
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
		recur(0, "");
		System.out.println(sb);
	}

	public static void recur(int n, String seq) {
		if (n == M) {
			sb.append(seq + "\n");
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			recur(n + 1, seq + nums[i] + " ");
		}
	}
}