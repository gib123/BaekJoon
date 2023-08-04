package D2.no2001;

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[][] area = new int[N][N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    area[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int[][] flies = new int[N - M + 1][N - M + 1];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < flies.length; i++) {
                for (int j = 0; j < flies[i].length; j++) {
                    for (int r = i; r < i + M; r++) {
                        for (int c = j; c < j + M; c++) {
                            flies[i][j] += area[r][c];
                        }
                    }
                    if (flies[i][j] > max) {
                        max = flies[i][j];
                    }
                }
            }
            System.out.println("#" + test_case + " " + max);
        }
    }
}