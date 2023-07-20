package silver.ii.no1012;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[][] land = new int[M][N];
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int e1 = Integer.parseInt(st.nextToken());
                int e2 = Integer.parseInt(st.nextToken());
                land[e1][e2] = 1;
            }
            Queue<int[]> q = new LinkedList<>();
            int[] dirR = {-1, 1, 0, 0};
            int[] dirC = {0, 0, -1, 1};
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if (land[j][k] == 0) continue;
                    q.offer(new int[] {j, k});
                    land[j][k] = 0;
                    while (!q.isEmpty()) {
                        int[] removePos = q.poll();
                        for (int m = 0; m < 4; m++) {
                            int curR = removePos[0] + dirR[m];
                            int curC = removePos[1] + dirC[m];
                            if (curR < 0 || curR >= M || curC < 0 || curC >= N) continue;
                            if (land[curR][curC] == 1) {
                                q.offer(new int[] {curR, curC});
                                land[curR][curC] = 0;
                            }
                        }
                    }
                    count++;
                }
            }
            sb.append(count + "\n");
        }
        System.out.println(sb);
    }
}