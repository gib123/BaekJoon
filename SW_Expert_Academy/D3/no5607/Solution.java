package D3.no5607;

import java.util.*;
import java.io.*;

public class Solution {
	static final int P = 1234567891;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		long[] num = new long[1000001];
		num[1] = 1;
		for (int i = 2; i < num.length; i++) {
			num[i] = (num[i - 1] * i) % P;
		}
		for(int test_case = 1; test_case <= T; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int R = Integer.parseInt(st.nextToken());
			long second = pow((num[N - R] * num[R]) % P, P - 2);
			long remainder = num[N] * second % P;
			System.out.println("#" + test_case + " " + remainder);
		}
	}

	public static long pow(long down, long up) {
		if (up == 0) return 1;
		if (up == 1) return down;
		if (up % 2 == 0) {
			long tmp = pow(down, up / 2);
			return tmp * tmp % P;
		}
		long tmp = pow(down, up - 1);
		return tmp * down % P;
	}

}