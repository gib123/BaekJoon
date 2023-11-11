package silver.iii.no15657;

import java.io.*;
import java.util.*;

public class Main {
	static int M;
	static int N;
	static int[] nums;
	static StringBuilder sb = new StringBuilder();

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		nums = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nums);
		recur(0, 0, new int[M]);
		System.out.println(sb);
	}

	public static void recur(int m, int start, int[] arr) {
		if (m == M) {
			for (int e : arr) {
				sb.append(e + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = start; i < N; i++) {
			arr[m] = nums[i];
			recur(m + 1, i, arr);
		}
	}
}