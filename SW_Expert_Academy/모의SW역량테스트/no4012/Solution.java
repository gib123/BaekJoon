package 모의SW역량테스트.no4012;

import java.util.*;
import java.io.*;

class Solution {
    static int N;
    static int[][] S;
    static boolean[] selected;
    static int[] arr1;
    static int[] arr2;
    static int min;
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++) {
            N = Integer.parseInt(br.readLine());
            S = new int[N][N];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    S[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            selected = new boolean[N];
            selected[0] = true;
            arr1 = new int[N / 2];
            arr1[0] = 0;
            arr2 = new int[N / 2];
            min = Integer.MAX_VALUE;
            recur(1, 1);
            System.out.println("#" + test_case + " " + min);
        }
    }

    public static void recur(int N1, int start) {
        if (N1 == N / 2) {
            int k = 0;
            for (int i = 0; i < N; i++) {
                if (!selected[i]) {
                    arr2[k++] = i;
                }
            }
            int S1 = 0;
            int S2 = 0;
            for (int i = 0; i < N1; i++) {
                for (int j = 0; j < N1; j++) {
                    S1 += S[arr1[i]][arr1[j]];
                    S2 += S[arr2[i]][arr2[j]];
                }
            }
            min = Math.min(min, Math.abs(S1 - S2));
            return;
        }
        for (int i = start; i < N; i++) {
            if (selected[i]) continue;
            selected[i] = true;
            arr1[N1] = i;
            recur(N1 + 1, i + 1);
            selected[i] = false;
        }
    }
}