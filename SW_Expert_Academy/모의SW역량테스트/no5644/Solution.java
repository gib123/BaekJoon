package 모의SW역량테스트.no5644;

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int A = Integer.parseInt(st.nextToken());
            int[] userA = new int[M];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                userA[i] = Integer.parseInt(st.nextToken());
            }
            int[] userB = new int[M];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                userB[i] = Integer.parseInt(st.nextToken());
            }
            int[][] BC = new int[A][4];
            for (int i = 0; i < A; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 4; j++) {
                    BC[i][j] = Integer.parseInt(st.nextToken());
                }
            } //입력 끝
            int[] dirX = {0, 0, 1, 0, -1};
            int[] dirY = {0, -1, 0, 1, 0};
            int[] curA = {1, 1};
            int[] curB = {10, 10};
            int max = 0;
            for (int i = -1; i < M; i++) {
                if (i > -1) {
                    curA = new int[] {curA[0] + dirX[userA[i]], curA[1] + dirY[userA[i]]};
                    curB = new int[] {curB[0] + dirX[userB[i]], curB[1] + dirY[userB[i]]};
                }
                boolean[] includedA = new boolean[A];
                boolean[] includedB = new boolean[A];
                for (int j = 0; j < A; j++) {
                    includedA[j] = (Math.abs(curA[0] - BC[j][0]) + Math.abs(curA[1] - BC[j][1])) <= BC[j][2];
                    includedB[j] = (Math.abs(curB[0] - BC[j][0]) + Math.abs(curB[1] - BC[j][1])) <= BC[j][2];
                }
                int prevSum = Integer.MIN_VALUE;
                for (int j = 0; j < A; j++) {
                    for (int k = 0; k < A; k++) {
                        int nowSum = 0;
                        if (includedA[j] && includedB[k]) {
                            nowSum = (j == k) ? BC[j][3] : BC[j][3] + BC[k][3];
                        } else if (includedA[j] || includedB[k]) {
                            nowSum = (includedA[j]) ? BC[j][3] : BC[k][3];
                        }
                        prevSum = Math.max(nowSum, prevSum);
                    }
                }
                max += prevSum;
            }
            System.out.println("#" + test_case + " " + max);
        }
    }
}