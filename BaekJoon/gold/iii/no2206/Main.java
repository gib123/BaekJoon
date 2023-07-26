package gold.iii.no2206;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] map = new char[N][];
        for (int i = 0; i < map.length; i++) {
            map[i] = br.readLine().toCharArray();
        }
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {0, 0, 0});
        boolean[][][] visited = new boolean[N][M][2];
        visited[0][0][0] = true;
        boolean arrive = false;
        int count = 1;
        int[] dirR = {-1, 1, 0, 0};
        int[] dirC = {0, 0, -1, 1};
        if (N == 1 && M == 1) {
            arrive = true;
        }
        while (!arrive && !q.isEmpty()) {
            int qSize = q.size();
            for (int i = 0; i < qSize; i++) {
                int[] rmPos = q.poll();
                for (int j = 0; j < 4; j++) {
                    int curR = rmPos[0] + dirR[j];
                    int curC = rmPos[1] + dirC[j];
                    if (curR == N - 1 && curC == M - 1) {
                        arrive = true;
                        break;
                    }
                    if (curR < 0 || curR >= N || curC < 0 || curC >= M) continue;
                    if (map[curR][curC] == '0') {
                        if (!visited[curR][curC][rmPos[2]]) {
                            q.offer(new int[] {curR, curC, rmPos[2]});
                            visited[curR][curC][rmPos[2]] = true;
                        }
                    } else {
                        if (rmPos[2] == 0 && !visited[curR][curC][1]) {
                            q.offer(new int[] {curR, curC, 1});
                            visited[curR][curC][1] = true;
                        }
                    }
                }
            }
            count++;
        }
        System.out.println((arrive) ? count : -1);
    }

}