package gold.ii.no16985;

import java.io.*;
import java.util.*;

public class Main {
	static int[][][] maze = new int[5][5][5];
	static int[][][] mazeCopy = new int[5][5][5];
	static boolean[] isSelected = new boolean[5];
	static int[] stackOrder = new int[5];
	static int[] direction = new int[5];
	static int[] dirR = {-1, 1, 0, 0, 0, 0};
	static int[] dirC = {0, 0, -1, 1, 0, 0};
	static int[] dirH = {0, 0, 0, 0, 1, -1};
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int k = 0; k < 5; k++) {
					maze[i][j][k] = Integer.parseInt(st.nextToken());
				}
			}
		}
		stackBoard(0);
		System.out.println((min == Integer.MAX_VALUE) ? -1 : min);
	}

	public static void stackBoard(int idx) {
		if (idx == 5) {
			mazeCopy = new int[5][5][5];
			rotate(0);
			return;
		}
		for (int i = 0; i < 5; i++) {
			if (isSelected[i]) continue;
			stackOrder[idx] = i;
			isSelected[i] = true;
			stackBoard(idx + 1);
			isSelected[i] = false;
		}
	}

	public static void rotate(int idx) {
		if (idx == 5) {
			for (int i = 0; i < 5; i++) {
				int boardN = stackOrder[i];
				int dirN = direction[boardN];
				for (int j = 0; j < 5; j++) {
					for (int k = 0; k < 5; k++) {
						if (dirN == 0) {
							mazeCopy[i][j][k] = maze[boardN][j][k];
						}
						if (dirN == 1) {
							mazeCopy[i][k][4 - j] = maze[boardN][j][k];
						}
						if (dirN == 2) {
							mazeCopy[i][4 - j][4 - k] = maze[boardN][j][k];
						}
						if (dirN == 3) {
							mazeCopy[i][4 - k][j] = maze[boardN][j][k];
						}
					}
				}
			}
			if (mazeCopy[0][0][0] == 1 && mazeCopy[4][4][4] == 1) {
				bfs();
			}
			return;
		}
		for (int i = 0; i < 5; i++) {
			direction[idx] = i;
			rotate(idx + 1);
		}
	}

	public static void bfs() {
		Queue<int[]> q = new ArrayDeque<>();
		boolean[][][] visited = new boolean[5][5][5];
		int moveCount = 0;
		q.offer(new int[] {0, 0, 0});
		visited[0][0][0] = true;
		while (!q.isEmpty()) {
			int qSize = q.size();
			for (int s = 0; s < qSize; s++) {
				int[] rmPos = q.poll();
				if (rmPos[0] == 4 && rmPos[1] == 4 && rmPos[2] == 4) {
					min = Math.min(moveCount, min);
					return;
				}
				for (int d = 0; d < 6; d++) {
					int curR = rmPos[0] + dirR[d];
					int curC = rmPos[1] + dirC[d];
					int curH = rmPos[2] + dirH[d];
					if (curR < 0 || curR >= 5 || curC < 0 || curC >= 5 || curH < 0 || curH >= 5) continue;
					if (visited[curR][curC][curH] || mazeCopy[curR][curC][curH] == 0) continue;
					q.offer(new int[] {curR, curC, curH});
					visited[curR][curC][curH] = true;
				}
			}
			moveCount++;
		}
	}
}