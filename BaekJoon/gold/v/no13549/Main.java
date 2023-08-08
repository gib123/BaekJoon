package gold.v.no13549;

import java.io.*;
import java.util.*;

class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] times = new int[100001];
        Arrays.fill(times, -1);
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[] {N, 0});
        times[N] = 0;
        int[][] dir = {{-1, 1}, {1, 1, 0}};
        while (!q.isEmpty()) {
            int[] rm = q.poll();
            for (int i = 0; i < 3; i++) {
                int curN = rm[0] + ((i == 2) ? rm[0] : dir[0][i]);
                int curT = rm[1] + dir[1][i];
                if (curN < 0 || curN > 100000) continue;
                if (times[curN] != -1 && curT >= times[curN]) continue;
                times[curN] = curT;
                q.offer(new int[] {curN, curT});
            }
        }
        System.out.println(times[K]);
    }
}