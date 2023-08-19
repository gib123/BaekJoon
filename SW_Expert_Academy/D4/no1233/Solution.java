package D4.no1233;

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int test_case = 1; test_case <= 10; test_case++) {
            int N = Integer.parseInt(br.readLine());
            boolean[] tree = new boolean[N + 1];
            StringTokenizer st = null;
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                int node = Integer.parseInt(st.nextToken());
                String content = st.nextToken();
                tree[node] = (content.charAt(0) >= '0' && content.charAt(0) <= '9') ? true : false;
            }
            Queue<Integer> q = new ArrayDeque<>();
            q.offer(1);
            boolean calculate = true;
            while (!q.isEmpty()) {
                int rm = q.poll();
                if (tree[rm] && rm * 2 + 1 <= N) {
                    calculate = false;
                    break;
                }
                if (!tree[rm] && rm * 2 > N) {
                    calculate = false;
                    break;
                }
                for (int i = 0; i < 2; i++) {
                    int cur = (i == 0) ? rm * 2 : rm * 2 + 1;
                    if (cur > N) continue;
                    q.offer(cur);
                }
            }
            System.out.println("#" + test_case + " " + ((calculate) ? 1 : 0));
        }
    }
}