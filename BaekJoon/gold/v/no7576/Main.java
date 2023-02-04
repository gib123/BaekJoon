package gold.v.no7576;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stSize = br.readLine().split(" ");
        int M = Integer.parseInt(stSize[0]);
        int N = Integer.parseInt(stSize[1]);
        int[][] box = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] stRow = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(stRow[j]);
            }
        }
        br.close();

        int[] dirX = {-1, 1, 0, 0};
        int[] dirY = {0, 0, -1, 1};
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 1) queue.offer(new int[] {i, j});
            }
        }
        int[][] day = new int[N][M];
        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            for (int j = 0; j < 4; j++) {
                int curX = pos[0] + dirX[j];
                int curY = pos[1] + dirY[j];
                if (curX < 0 || curX >= N || curY < 0 || curY >= M) continue;
                if (box[curX][curY] != 0) continue;
                queue.offer(new int[] {curX, curY});
                day[curX][curY] = day[pos[0]][pos[1]] + 1;
                box[curX][curY] = 1;
            }
        }
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) {
                    answer = -1;
                    break;
                }
                answer = (day[i][j] > answer) ? day[i][j] : answer;
            }
            if (answer == -1) break;
        }
        System.out.println(answer);
    }
}