package D3.no5215;

import java.util.*;
import java.io.*;

class Solution {
    static int N;
    static int L;
    static int[][] info;
    static int max;
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++) {
            String[] tmp = br.readLine().split(" ");
            N = Integer.parseInt(tmp[0]);
            L = Integer.parseInt(tmp[1]);
            info = new int[N][2];
            for (int i = 0; i < N; i++) {
                tmp = br.readLine().split(" ");
                info[i][0] = Integer.parseInt(tmp[0]);
                info[i][1] = Integer.parseInt(tmp[1]);
            }
            max = 0;
            sumRecur(0, 0, 0);
            System.out.println("#" + test_case + " " + max);
        }
    }

    public static void sumRecur(int i, int sumScore, int sumKcal) {
        if (sumKcal > L) return;
        if (i == N) {
            if (sumScore > max) max = sumScore;
            return;
        }
        sumRecur(i + 1, sumScore + info[i][0], sumKcal + info[i][1]);
        sumRecur(i + 1, sumScore, sumKcal);
    }
}