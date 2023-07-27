package D2.no1959;

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] A = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }
            int[] B = new int[M];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }
            int max = Integer.MIN_VALUE;
            int longer = (N > M) ? N : M;
            int shorter = (N < M) ? N : M;
            for (int i = 0; i < longer - shorter + 1; i++) {
                int sum = 0;
                int[] longArr = (N >= M) ? A : B;
                int[] shortArr = (N < M) ? A : B;
                for (int j = 0; j < shorter; j++) {
                    sum += (longArr[i + j] * shortArr[j]);
                }
                if (sum > max) {
                    max = sum;
                }
            }
            System.out.println("#" + test_case + " " + max);
        }
    }
}