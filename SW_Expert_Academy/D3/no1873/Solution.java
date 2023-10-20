package D3.no1873;

import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int test_case = 1; test_case <= T; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			char[][] map = new char[H][];
			int[] player = new int[2];
			char[] playerShape = {'^', 'v', '>', '<'};
			for (int i = 0; i < H; i++) {
				String line = br.readLine();
				for (int j = 0; j < 4; j++) {
					int index = line.indexOf(playerShape[j]);
					if (index >= 0) {
						player = new int[] {i, index};
					}
				}
				map[i] = line.toCharArray();
			}
			int[] dirR = {-1, 1, 0, 0};
			int[] dirC = {0, 0, 1, -1};
			char[] moveCommand = {'U', 'D', 'R', 'L'};
			int N = Integer.parseInt(br.readLine());
			String commands = br.readLine();
			for (int i = 0; i < N; i++) {
				char command = commands.charAt(i);
				int moveR = 0;
				int moveC = 0;
				for (int j = 0; j < 4; j++) {
					if (command != moveCommand[j]) continue;
					map[player[0]][player[1]] = playerShape[j];
					moveR = player[0] + dirR[j];
					moveC = player[1] + dirC[j];
					if (moveR < 0 || moveR >= H || moveC < 0 || moveC >= W) break;
					if (map[moveR][moveC] == '.') {
						map[player[0]][player[1]] = '.';
						map[moveR][moveC] = playerShape[j];
						player[0] = moveR;
						player[1] = moveC;
					}
				}
				if (command == 'S') {
					for (int j = 0; j < 4; j++) {
						if (map[player[0]][player[1]] != playerShape[j]) continue;
						moveR = player[0];
						moveC = player[1];
						while (map[moveR][moveC] != '#') {
							moveR += dirR[j];
							moveC += dirC[j];
							if (moveR < 0 || moveR >= H || moveC < 0 || moveC >= W) break;
							if (map[moveR][moveC] == '*') {
								map[moveR][moveC] = '.';
								break;
							}
						}
					}
				}
			}
			StringBuilder sb = new StringBuilder();
			for (char[] ma : map) {
				for (char m : ma) {
					sb.append(m);
				}
				sb.append("\n");
			}
			System.out.print("#" + test_case + " " + sb);
		}
	}
}