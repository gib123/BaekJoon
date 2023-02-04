package silver.i.no2178;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stSize = br.readLine().split(" ");
        int N = Integer.parseInt(stSize[0]);
        int M = Integer.parseInt(stSize[1]);
        int[][] maze = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] stRow = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                maze[i][j] = Integer.parseInt(stRow[j]);
            }
        }
        br.close();

        int[] dirX = {-1, 1, 0, 0};
        int[] dirY = {0, 0, -1, 1};
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];
        queue.offer(new int[] {0, 0});
        visited[0][0] = true;
        int[][] road = new int[N][M];
        while (!queue.isEmpty()) {
            int qSize = queue.size();
            for (int i = 0; i < qSize; i++) {
                int[] pos = queue.poll();
                for (int j = 0; j < 4; j++) {
                    int curX = pos[0] + dirX[j];
                    int curY = pos[1] + dirY[j];
                    if (curX < 0 || curX >= N || curY < 0 || curY >= M) continue;
                    if (visited[curX][curY] || maze[curX][curY] == 0) continue;
                    queue.offer(new int[] {curX, curY});
                    visited[curX][curY] = true;
                    road[curX][curY] = road[pos[0]][pos[1]] + 1;
                }
            }
        }
        System.out.println(road[N - 1][M - 1] + 1);
    }
}