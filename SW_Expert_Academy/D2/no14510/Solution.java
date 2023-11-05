package D2.no14510;

import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			int[] trees = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				trees[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(trees);
			int[] days = new int[2];
			int highest = trees[N - 1];
			for (int i = 0; i < N; i++) {
				trees[i]  = highest - trees[i];
				days[0] += trees[i] % 2;
				days[1] += trees[i] / 2;
			}
			int count = 0;
			if (days[0] > days[1]) {
				count = days[0] * 2 - 1;
			} else if (days[0] == days[1]) {
				count = days[0] * 2;
			} else {
				count = 2 * days[0] + (days[1] - days[0]) / 3 * 4;
				count += ((days[1] - days[0]) % 3 == 0) ? 0 : (((days[1] - days[0]) % 3 == 1) ? 2 : 3);
			}
			System.out.println("#" + test_case + " " + count);
		}
	}

}