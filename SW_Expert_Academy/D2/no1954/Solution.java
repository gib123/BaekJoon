package D2.no1954;

import java.io.*;

class Solution {
    static int[][] nums;
    static int N;
    static int[] dirR = {0, 1, 0, -1};
    static int[] dirC = {1, 0, -1, 0};

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++) {
            N = Integer.parseInt(br.readLine());
            nums = new int[N][N];
            nums[0][0] = 1;
            makeArray(0, 0, 2);
            StringBuilder sb = new StringBuilder();
            for (int[] num : nums) {
                for (int n : num) {
                    sb.append(n + " ");
                }
                sb.append("\n");
            }
            System.out.print("#" + test_case + "\n" + sb);
        }
    }

    public static void makeArray(int R, int C, int count) {
        for (int i = 0; i < 4; i++) {
            int curR = R + dirR[i];
            int curC = C + dirC[i];
            if (curR < 0 || curC < 0 || curR >= N || curC >= N) continue;
            if (nums[curR][curC] == 0) {
                nums[curR][curC] = count++;
                makeArray(curR, curC, count);
            }
        }
    }
}