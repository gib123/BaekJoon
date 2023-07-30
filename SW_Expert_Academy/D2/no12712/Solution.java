package D2.no12712;

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
            int[][] fly = new int[N][N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < fly[i].length; j++) {
                    fly[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int max = -1;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int plusCount = fly[i][j];
                    int xCount = fly[i][j];
                    for (int k = 1; k < M; k++) {
                        if (i - k >= 0) {
                            plusCount += fly[i - k][j];
                        }
                        if (i + k < N) {
                            plusCount += fly[i + k][j];
                        }
                        if (j - k >= 0) {
                            plusCount += fly[i][j - k];
                        }
                        if (j + k < N) {
                            plusCount += fly[i][j + k];
                        }
                        if (i - k >= 0 && j - k >= 0) {
                            xCount += fly[i - k][j - k];
                        }
                        if (i - k >= 0 && j + k < N) {
                            xCount += fly[i - k][j + k];
                        }
                        if (i + k < N && j - k >= 0) {
                            xCount += fly[i + k][j - k];
                        }
                        if (i + k < N && j + k < N) {
                            xCount += fly[i + k][j + k];
                        }
                    }
                    if (plusCount > max) {
                        max = plusCount;
                    }
                    if (xCount > max) {
                        max = xCount;
                    }
                }
            }
            System.out.println("#" + test_case + " " + max);
        }
    }
}