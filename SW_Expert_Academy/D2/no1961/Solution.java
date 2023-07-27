package D2.no1961;

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= T; test_case++) {
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    sb.append(arr[N - j - 1][i]);
                }
                sb.append(" ");
                for (int j = 0; j < N; j++) {
                    sb.append(arr[N - i - 1][N - j - 1]);
                }
                sb.append(" ");
                for(int j = 0; j < N; j++) {
                    sb.append(arr[j][N - i - 1]);
                }
                if (i != N - 1) {
                    sb.append("\n");
                }
            }
            System.out.println("#" + test_case + "\n" + sb);
        }
    }
}