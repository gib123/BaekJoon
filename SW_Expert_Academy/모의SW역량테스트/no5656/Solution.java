package 모의SW역량테스트.no5656;

import java.util.*;
import java.io.*;

public class Solution {
	static int N;
	static int W;
	static int H;
	static int[][] initBricks;
	static int min;
	static int[] dirR = {-1, 1, 0, 0};
	static int[] dirC = {0, 0, -1, 1};
	static int[] selected;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			H = Integer.parseInt(st.nextToken());
			initBricks = new int[H][W];
			for (int i = 0; i < H; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < W; j++) {
					initBricks[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			min = Integer.MAX_VALUE;
			selected = new int[N];
			recur(0, initBricks);
			System.out.println("#" + test_case + " " + ((min == Integer.MAX_VALUE) ? 0 : min));
		}
	}

	public static void recur(int n, int[][] bricks) {
		int[][] tmpBricks = new int[H][W];
		for (int i = 0; i < H; i++) {
			tmpBricks[i] = Arrays.copyOf(bricks[i], W);
		}
		if (n > 0) {
			if (!playGame(tmpBricks, selected[n - 1])) return;
			if (n == N) {
				int count = 0;
				for (int i = 0; i < H; i++) {
					for (int j = 0; j < W; j++) {
						if (tmpBricks[i][j] != 0) count++;
					}
				}
				if (count < min) min = count;
				return;
			}
		}
		for (int i = 0; i < W; i++) {
			selected[n] = i;
			recur(n + 1, tmpBricks);
		}
	}

	public static boolean playGame(int[][] bricks, int brokenCIdx) {
		int brokenRIdx = -1;
		for (int i = 0; i < H; i++) {
			if (bricks[i][brokenCIdx] > 0) {
				brokenRIdx = i;
				break;
			}
		}
		if (brokenRIdx == -1) return false;
		Queue<int[]> q = new ArrayDeque<>();
		q.offer(new int[] {brokenRIdx, brokenCIdx, bricks[brokenRIdx][brokenCIdx]});
		bricks[brokenRIdx][brokenCIdx] = 0;
		while (!q.isEmpty()) {
			int[] now = q.poll();
			for (int i = 0; i < now[2] - 1; i++) {
				for (int d = 0; d < 4; d++) {
					int[] next = {now[0] + dirR[d] * (i + 1), now[1] + dirC[d] * (i + 1)};
					if (next[0] < 0 || next[0] >= H || next[1] < 0 || next[1] >= W) continue;
					if (bricks[next[0]][next[1]] != 0) {
						q.offer(new int[] {next[0], next[1], bricks[next[0]][next[1]]});
						bricks[next[0]][next[1]] = 0;
					}
				}
			}
		}
		for (int j = 0; j < W; j++) {
			int emptyRIdx = -1;
			for (int i = H - 1; i >= 0; i--) {
				if (bricks[i][j] == 0) {
					emptyRIdx = i;
					break;
				}
			}
			for (int i = emptyRIdx - 1; i >= 0; i--) {
				if (bricks[i][j] != 0) {
					bricks[emptyRIdx--][j] = bricks[i][j];
					bricks[i][j] = 0;
				}
			}
		}
		return true;
	}
}