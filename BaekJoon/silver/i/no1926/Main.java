package silver.i.no1926;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stSize = br.readLine().split(" ");
        int rSize = Integer.parseInt(stSize[0]);
        int cSize = Integer.parseInt(stSize[1]);
        int[][] paper = new int[rSize][cSize];
        for (int i = 0; i < rSize; i++) {
            String[] stRow = br.readLine().split(" ");
            for (int j = 0; j < cSize; j++) {
                paper[i][j] = Integer.parseInt(stRow[j]);
            }
        }
        br.close();

        int maxSize = 0;
        int count = 0;
        int[] dirX = {-1, 1, 0, 0};
        int[] dirY = {0, 0, -1, 1};
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rSize][cSize];
        for (int i = 0; i < rSize; i++) {
            for (int j = 0; j < cSize; j++) {
                if (visited[i][j] || paper[i][j] == 0) continue;
                queue.offer(new int[] {i, j});
                visited[i][j] = true;
                int size = 1;
                while (!queue.isEmpty()) {
                    int[] pos = queue.poll();
                    for (int k = 0; k < 4; k++) {
                        int curX = pos[0] + dirX[k];
                        int curY = pos[1] + dirY[k];
                        if (curX < 0 || curX >= rSize || curY < 0 || curY >= cSize) continue;
                        if (visited[curX][curY] || paper[curX][curY] == 0) continue;
                        queue.offer(new int[] {curX, curY});
                        visited[curX][curY] = true;
                        size++;
                    }
                }
                maxSize = (size > maxSize) ? size : maxSize;
                count++;
            }
        }
        System.out.println(count + "\n" + maxSize);
    }
}