package 모의SW역량테스트.no5604;

import java.util.*;
import java.io.*;

public class Solution {
	static long number[];
	static long result;
	static long start;
	static long end;
	static long mul;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			start = Long.parseLong(st.nextToken());
			end = Long.parseLong(st.nextToken());
			number = new long[10];
			result = 0;
			mul = 1;
			if(start == 0) start = 1;
			while (start <= end) {
				while(start % 10 != 0 && start <= end) {
					cal(start);
					start++;
				}
				if(start>end) break;
				while(end % 10 != 9 && start <= end) {
					cal(end);
					end--;
				}
				long diff = end / 10 - start / 10 + 1;
				for(int i=0;i<10;i++)
					number[i] += diff * mul;
				mul *= 10;
				start /= 10;
				end /= 10;
			}
			for (int i = 1; i < 10; i++)
				result += (i * number[i]);
			System.out.println("#" + test_case + " " + result);
		}
	}

	static void cal(long a) {
		for (long i = a; i > 0; i /= 10) {
			String s = Long.toString(i);
			int t = s.charAt(s.length()-1)-'0';
			number[t] += mul;
		}
	}
}