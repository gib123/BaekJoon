package silver.ii.no15663;
import java.io.*;
import java.util.*;

class Main {
	static int[] nums;
	static int M;
	static StringBuilder sb = new StringBuilder();

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nums);
		recur(0, 0, new int[M]);
		System.out.print(sb);
	}

	public static void recur(int m, int flag, int[] arr) {
		if (m == M) {
			for (int e : arr) {
				sb.append(e + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if ((flag & 1 << i) != 0) continue;
			if (arr[m] == nums[i]) continue;
			arr[m] = nums[i];
			recur(m + 1, flag | 1 << i, arr);
		}
		arr[m] = 0;
	}
}