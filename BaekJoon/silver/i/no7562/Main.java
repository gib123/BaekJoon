package silver.i.no7562;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] dirR = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dirC = {1, 2, 2, 1, -1, -2, -2, -1};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            boolean[][] board = new boolean[N][N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startR = Integer.parseInt(st.nextToken());
            int startC = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int arriveR = Integer.parseInt(st.nextToken());
            int arriveC = Integer.parseInt(st.nextToken());
            boolean arrive = false;
            if (startR == arriveR && startC == arriveC) {
                arrive = true;
            }
            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[] {startR, startC});
            board[startR][startC] = true;
            int count = 0;
            int qSize = 0;
            while (!arrive) {
                if (qSize == 0) {
                    qSize = q.size();
                    count++;
                }
                int[] removePos = q.poll();
                for (int j = 0; j < 8; j++) {
                    int curR = removePos[0] + dirR[j];
                    int curC = removePos[1] + dirC[j];
                    if (curR == arriveR && curC == arriveC) {
                        arrive = true;
                        break;
                    }
                    if (curR < 0 || curR >= N || curC < 0 || curC >= N) continue;
                    if (!board[curR][curC]) {
                        q.offer(new int[] {curR, curC});
                        board[curR][curC] = true;
                    }
                }
                qSize--;
            }
            sb.append(count + "\n");
        }
        System.out.println(sb);
    }

}