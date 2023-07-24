package gold.iv.no5427;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            char[][] building = new char[r][c];
            Queue<int[]> q = new LinkedList<>();
            for (int j = 0; j < building.length; j++) {
                String str = br.readLine();
                building[j] = str.toCharArray();
                int index = str.indexOf('@');
                if (index != -1) {
                    q.offer(new int[] {j, index});
                }
            }
            for (int j = 0; j < building.length; j++) {
                for (int k = 0; k < building[j].length; k++) {
                    if (building[j][k] == '*') {
                        q.offer(new int[] {j, k});
                    }
                }
            }
            boolean escape = false;
            int count = 0;
            int[] dirR = {-1, 1, 0, 0};
            int[] dirC = {0, 0, -1, 1};
            while (!q.isEmpty() && !escape) {
                int qSize = q.size();
                for (int j = 0; j < qSize; j++) {
                    int[] RvPos = q.poll();
                    char chRv = building[RvPos[0]][RvPos[1]];
                    if (chRv == '@' && (RvPos[0] == 0 || RvPos[0] == r - 1 || RvPos[1] == 0 || RvPos[1] == c - 1)) {
                        escape = true;
                        break;
                    }
                    for (int k = 0; k < dirR.length; k++) {
                        int curR = RvPos[0] + dirR[k];
                        int curC = RvPos[1] + dirC[k];
                        if (curR < 0 || curR >= r || curC < 0 || curC >= c) continue;
                        char chCur = building[curR][curC];
                        if (chCur == '.' || chCur == '@') {
                            if (chRv == '@' && chCur == '@') continue;
                            building[curR][curC] = chRv;
                            q.offer(new int[] {curR, curC});
                        }
                    }
                }
                count++;
            }
            sb.append(((escape) ? count : "IMPOSSIBLE") + "\n");
        }
        System.out.print(sb);
    }
}