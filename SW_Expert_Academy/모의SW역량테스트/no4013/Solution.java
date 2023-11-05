package 모의SW역량테스트.no4013;

import java.util.*;
import java.io.*;

public class Solution {
	static int[][] magnet;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++) {
			int K = Integer.parseInt(br.readLine());
			magnet = new int[5][9];
			StringTokenizer st;
			for (int i = 1; i <= 4; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 1; j <= 8; j++) {
					magnet[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			for (int c = 0; c < K; c++) {
				st = new StringTokenizer(br.readLine());
				int magnetN = Integer.parseInt(st.nextToken());
				int dir = Integer.parseInt(st.nextToken());
				rotate(getList(magnetN, dir));
			}
			int total = 0;
			for (int i = 1; i <= 4; i++) {
				total += ((magnet[i][1] == 0) ? 0 : (int)Math.pow(2, i - 1));
			}
			System.out.println("#" + test_case + " " + total);
		}
	}

	public static ArrayList<int[]> getList(int magnetN, int dir) {
		ArrayList<int[]> rotateList = new ArrayList<>();
		rotateList.add(new int[] {magnetN, dir});
		Queue<int[]> q = new ArrayDeque<>();
		boolean[] visited = new boolean[5];
		q.offer(new int[] {magnetN, dir});
		visited[magnetN] = true;
		while (!q.isEmpty()) {
			int[] now = q.poll();
			if (now[0] - 1 >= 1 && !visited[now[0] - 1]) {
				if (magnet[now[0] - 1][3] != magnet[now[0]][7]) {
					rotateList.add(new int[] {now[0] - 1, now[1] * -1});
					q.offer(new int[] {now[0] - 1, now[1] * -1});
					visited[now[0] - 1] = true;
				}
			}
			if (now[0] + 1 <= 4 && !visited[now[0] + 1]) {
				if (magnet[now[0]][3] != magnet[now[0] + 1][7]) {
					rotateList.add(new int[] {now[0] + 1, now[1] * -1});
					q.offer(new int[] {now[0] + 1, now[1] * -1});
					visited[now[0] + 1] = true;
				}
			}
		}
		return rotateList;
	}

	public static void rotate(ArrayList<int[]> rotateList) {
		for (int[] rotate : rotateList) {
			if (rotate[1] == 1) {
				int preNum = magnet[rotate[0]][8];
				for (int i = 1; i <= 8; i++) {
					int nowNum = magnet[rotate[0]][i];
					magnet[rotate[0]][i] = preNum;
					preNum = nowNum;
				}
			} else {
				int preNum = magnet[rotate[0]][1];
				for (int i = 8; i >= 1; i--) {
					int nowNum = magnet[rotate[0]][i];
					magnet[rotate[0]][i] = preNum;
					preNum = nowNum;
				}
			}
		}
	}
}