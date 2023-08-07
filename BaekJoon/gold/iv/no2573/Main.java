package gold.iv.no2573;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] ice = new int[N][M];
        int totalIce = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                ice[i][j] = Integer.parseInt(st.nextToken());
                if (ice[i][j] > 0) {
                    totalIce++;
                }
            }
        }
        int year = 0;
        Queue<int[]> q = new LinkedList<>();
        int[] dirR = {-1, 1, 0, 0};
        int[] dirC = {0, 0, -1, 1};
        boolean overTwo = false;
        while (!overTwo && totalIce > 0) {
            boolean[][] visited = new boolean[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (ice[i][j] <= 0 || visited[i][j]) continue;
                    q.offer(new int[] {i, j});
                    visited[i][j] = true;
                    int visitedNum = 1;
                    while (!q.isEmpty()) {
                        int[] rmPos = q.poll();
                        int seaCount = 0;
                        for (int k = 0; k < dirR.length; k++) {
                            int curR = rmPos[0] + dirR[k];
                            int curC = rmPos[1] + dirC[k];
                            if (curR < 0 || curR >= N || curC < 0 || curC >= M) continue;
                            if (!visited[curR][curC] && ice[curR][curC] > 0) {
                                q.offer(new int[] {curR, curC});
                                visited[curR][curC] = true;
                                visitedNum++;
                            }
                            if (ice[curR][curC] <= 0 && !visited[curR][curC]) {
                                seaCount++;
                            }
                        }
                        ice[rmPos[0]][rmPos[1]] -= seaCount;
                        if (ice[rmPos[0]][rmPos[1]] <= 0) {
                            totalIce--;
                            visitedNum--;
                        }
                    }
                    if (totalIce != visitedNum) {
                        overTwo = true;
                    }
                }
            }
            year++;
        }
        System.out.println((overTwo) ? year - 1 : 0);
    }
}