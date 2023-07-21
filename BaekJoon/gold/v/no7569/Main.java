package gold.v.no7569;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int[][][] box = new int[H][N][M];
        Queue<int[]> q = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    box[i][j][k] = Integer.parseInt(st.nextToken());
                    if (box[i][j][k] != 0) {
                        count++;
                    }
                    if (box[i][j][k] == 1) {
                        q.offer(new int[] {i, j, k});
                    }
                }
            }
        }
        int[] dirR = {-1, 1, 0, 0, 0, 0};
        int[] dirC = {0, 0, -1, 1, 0, 0};
        int[] dirH = {0, 0, 0, 0, -1, 1};
        int day = 0;
        if (count != M * N * H) {
            while(!q.isEmpty()) {
                int qSize = q.size();
                for (int i = 0; i < qSize; i++) {
                    int[] removePos = q.poll();
                    for (int j = 0; j < 6; j++) {
                        int curH = removePos[0] + dirH[j];
                        int curR = removePos[1] + dirR[j];
                        int curC = removePos[2] + dirC[j];
                        if (curR < 0 || curR >= N || curC < 0 || curC >= M || curH < 0 || curH >= H) continue;
                        if (box[curH][curR][curC] == 0) {
                            q.offer(new int[] {curH, curR, curC});
                            box[curH][curR][curC] = 1;
                            count++;
                        }
                    }
                }
                day++;
            }
            day--;
        }
        System.out.println((count == M * N * H) ? day : -1);
    }

}