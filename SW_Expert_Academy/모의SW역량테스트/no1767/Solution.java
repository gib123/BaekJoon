package 모의SW역량테스트.no1767;

import java.util.*;
import java.io.*;

public class Solution {
	static ArrayList<int[]> cellRC;
	static int N;
	static int cellN;
	static int minLen;
	static int maxNum;
	static int[] dirR = {-1, 1, 0, 0};
	static int[] dirC = {0, 0, -1, 1};

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int test_case = 1; test_case <= T; test_case++) {
			minLen = Integer.MAX_VALUE;
			maxNum = Integer.MIN_VALUE;
			N = Integer.parseInt(br.readLine());
			int[][] processer = new int[N][N];
			cellRC = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					processer[i][j] = Integer.parseInt(st.nextToken());
					if (processer[i][j] == 1) {
						if (i == 0 || j == 0 || i == N - 1 || j == N - 1) {
							maxNum++;
						} else {
							cellRC.add(new int[] {i, j});
						}
					}
				}
			}
			cellN = cellRC.size();
			recur(0, 0, 0, processer);
			System.out.println("#" + test_case + " " + minLen);
		}
	}

	public static void recur(int n, int totalLen, int totalNum, int[][] processer) {
		if (maxNum > totalNum + (cellN - n)) {
			return;
		}
		if (maxNum == totalNum + (cellN - n) && minLen <= totalLen) {
			return;
		}
		if (n == cellN) {
			if (maxNum == totalNum) {
				minLen = Math.min(minLen, totalLen);
			}
			if (totalNum > maxNum){
				maxNum = totalNum;
				minLen = totalLen;
			}
			return;
		}
		int[][] pCopy = new int[N][N];
		for (int i = 0; i < dirR.length; i++) {
			for (int j = 0; j < N; j++) {
				pCopy[j] = Arrays.copyOf(processer[j], N);
			}
			int[] now = cellRC.get(n);
			int len = 0;
			while (true) {
				int nextR = now[0] + dirR[i];
				int nextC = now[1] + dirC[i];
				if (nextR < 0 || nextC < 0 || nextR >= N || nextC >= N) {
					recur(n + 1, totalLen + len, totalNum + 1, pCopy);
					break;
				}
				if (pCopy[nextR][nextC] == 2 || pCopy[nextR][nextC] == 1) {
					recur(n + 1, totalLen, totalNum, processer);
					break;
				}
				len++;
				pCopy[nextR][nextC] = 2;
				now = new int[] {nextR, nextC};
			}
		}
	}
}