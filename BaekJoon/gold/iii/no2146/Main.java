package gold.iii.no2146;

import java.util.*;
import java.io.*;

class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        for (int i = 0; i < map.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Queue<int[]> q = new LinkedList<>();
        int[] dirR = {0, -1, 1, 0, 0};
        int[] dirC = {0, 0, 0, -1, 1};
        int num = 2;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] != 1) continue;
                q.offer(new int[] {i, j});
                while (!q.isEmpty()) {
                    int[] rmPos = q.poll();
                    for (int k = 0; k < dirR.length; k++) {
                        int curR = rmPos[0] + dirR[k];
                        int curC = rmPos[1] + dirC[k];
                        if (curR < 0 || curC < 0 || curR >= N || curC >= N) continue;
                        if (map[curR][curC] == 1) {
                            map[curR][curC] = num;
                            q.offer(new int[] {curR, curC});
                        }
                    }
                }
                num++;
            }
        }

        q = new LinkedList<>();
        int bridge = 0;
        boolean connect = false;
        boolean oneMore = true;
        while (!connect) {
            boolean[][] visited = new boolean[N][N];
            boolean[][] created = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (map[i][j] == 0 || created[i][j]) continue;
                    q.offer(new int[] {i, j});
                    visited[i][j] = true;
                    while (!q.isEmpty()) {
                        int[] rmPos = q.poll();
                        for (int k = 0; k < dirR.length; k++) {
                            int curR = rmPos[0] + dirR[k];
                            int curC = rmPos[1] + dirC[k];
                            if (curR < 0 || curC < 0 || curR >= N || curC >= N) continue;
                            int curLand = map[rmPos[0]][rmPos[1]];
                            if (map[curR][curC] == 0) {
                                map[curR][curC] = curLand;
                                visited[curR][curC] = true;
                                created[curR][curC] = true;
                            }
                            if (!visited[curR][curC] && map[curR][curC] == curLand) {
                                q.offer(new int[] {curR, curC});
                                visited[curR][curC] = true;
                            }
                            if (map[curR][curC] != curLand) {
                                oneMore = (visited[curR][curC] && oneMore) ? true : false;
                                connect = true;
                            }
                        }
                    }
                }
            }
            bridge += 2;
        }
        System.out.println(bridge = bridge + ((oneMore) ? 1 : 0) - 2);
    }
}