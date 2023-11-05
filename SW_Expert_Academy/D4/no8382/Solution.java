package D4.no8382;

import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[][] xy = new int[2][2];
			xy[0][0] = Integer.parseInt(st.nextToken());
			xy[0][1] = Integer.parseInt(st.nextToken());
			xy[1][0] = Integer.parseInt(st.nextToken());
			xy[1][1] = Integer.parseInt(st.nextToken());

			int[] dis = {Math.abs(xy[0][0] - xy[1][0]), Math.abs(xy[0][1] - xy[1][1])};
			int count = 0;
			if (dis[0] == dis[1] || dis[0] == dis[1] + 1 || dis[0] + 1 == dis[1]) {
				count = dis[0] + dis[1];
			} else if (dis[0] > dis[1] + 1) {
				count = dis[1] * 2 + 1;
				int diff = dis[0] - dis[1] - 1;
				count += (diff % 2 == 0) ? diff / 2 * 4 : diff / 2 * 4 + 3;
			} else if (dis[0] + 1 < dis[1]) {
				count = dis[0] * 2 + 1;
				int diff = dis[1] - dis[0] - 1;
				count += (diff % 2 == 0) ? diff / 2 * 4 : diff / 2 * 4 + 3;
			}
			System.out.println("#" + test_case + " " + count);
		}
	}

}