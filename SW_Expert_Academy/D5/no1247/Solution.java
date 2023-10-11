package D5.no1247;

import java.util.*;
import java.io.*;

class Solution {
    static int N;
    static int[][] customers;
    static boolean[] visited;
    static int[] home;
    static int min;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++) {
            min = Integer.MAX_VALUE;
            N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] company = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            home = new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            customers = new int[N][2];
            for (int i = 0; i <N; i++) {
                customers[i][0] = Integer.parseInt(st.nextToken());
                customers[i][1] = Integer.parseInt(st.nextToken());
            }
            visited = new boolean[N];
            recur(0, new int[] {company[0], company[1]}, 0);
            System.out.println("#" + test_case + " " + min);
        }
    }

    public static void recur(int n, int[] prev, int sum) {
        if (sum >= min) {
            return;
        }
        if (n == N) {
            sum += Math.abs(prev[0] - home[0]) + Math.abs(prev[1] - home[1]);
            min = Math.min(min, sum);
            return;
        }
        for (int i = 0; i < N; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            recur(n + 1, customers[i], sum + Math.abs(prev[0] - customers[i][0]) + Math.abs(prev[1] - customers[i][1]));
            visited[i] = false;
        }
    }
}