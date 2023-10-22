package D4.no1251;

import java.util.*;
import java.io.*;

public class Solution {

	static class Vertex implements Comparable<Vertex> {
		int v;
		double w;

		public Vertex(int v, double w) {
			this.v = v;
			this.w = w;
		}

		public int compareTo(Vertex o) {
			return Double.compare(this.w, o.w);
		}
	}

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			int[][] island = new int[N][2];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				island[i][0] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				island[i][1] = Integer.parseInt(st.nextToken());
			}
			double E = Double.parseDouble(br.readLine());

			double[][] weight = new double[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					double L = ((long)Math.pow(Math.abs(island[i][0] - island[j][0]), 2) + (long)Math.pow(Math.abs(island[i][1] - island[j][1]), 2)) * E;
					weight[i][j] = L;
					weight[j][i] = L;
				}
			}

			double[] minEdge = new double[N];
			Arrays.fill(minEdge, Double.MAX_VALUE);
			minEdge[0] = 0;
			PriorityQueue<Vertex> pq = new PriorityQueue<>();
			pq.offer(new Vertex(0, minEdge[0]));

			boolean[] visited = new boolean[N];
			double result = 0;
			int count = 0;
			while (!pq.isEmpty()) {
				Vertex cur = pq.poll();
				if (visited[cur.v]) continue;

				visited[cur.v] = true;
				result += cur.w;
				if (++count == N) break;

				for (int i = 0; i < N; i++) {
					if (!visited[i] && minEdge[i] > weight[cur.v][i]) {
						minEdge[i] = weight[cur.v][i];
						pq.offer(new Vertex(i, minEdge[i]));
					}
				}
			}
			System.out.printf("#%d %.0f\n", test_case, result);
		}
	}
}