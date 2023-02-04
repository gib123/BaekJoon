package gold.iv.no4179;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stSize = br.readLine().split(" ");
        int R = Integer.parseInt(stSize[0]);
        int C = Integer.parseInt(stSize[1]);
        char[][] maze = new char[R][C];
        for (int i = 0; i < R; i++) {
            String row = br.readLine();
            for (int j = 0; j < C; j++) {
                maze[i][j] = row.charAt(j);
            }
        }
        br.close();

        int[] dirX = {-1, 1, 0, 0};
        int[] dirY = {0, 0, -1, 1};
        Queue<int[]> jQueue = new LinkedList<>();
        Queue<int[]> fQueue = new LinkedList<>();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (maze[i][j] == 'J') jQueue.offer(new int[] {i, j});
                if (maze[i][j] == 'F') fQueue.offer(new int[] {i, j});
            }
        }
        int[][] time = new int[R][C];
        while (!jQueue.isEmpty()) {
            int fqSize = fQueue.size();
            for (int i = 0; i < fqSize; i++) {
                int[] fPos = fQueue.poll();
                for (int j = 0; j < 4; j++) {
                    int curX = fPos[0] + dirX[j];
                    int curY = fPos[1] + dirY[j];
                    if (curX < 0 || curX >= R || curY < 0 || curY >= C) continue;
                    if (maze[curX][curY] == '#' || maze[curX][curY] == 'F') continue;
                    fQueue.offer(new int[] {curX, curY});
                    maze[curX][curY] = 'F';
                }
            }
            int jqSize = jQueue.size();
            for (int i = 0; i < jqSize; i++) {
                int[] jPos = jQueue.poll();
                for (int j = 0; j < 4; j++) {
                    int curX = jPos[0] + dirX[j];
                    int curY = jPos[1] + dirY[j];
                    if (curX < 0 || curX >= R || curY < 0 || curY >= C) {
                        System.out.println(time[jPos[0]][jPos[1]] + 1);
                        return;
                    }
                    if (maze[curX][curY] != '.') continue;
                    jQueue.offer(new int[] {curX, curY});
                    maze[curX][curY] = 'J';
                    time[curX][curY] = time[jPos[0]][jPos[1]] + 1;
                }
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}