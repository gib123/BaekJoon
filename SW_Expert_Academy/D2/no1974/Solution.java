package D2.no1974;

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T= Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= T; test_case++) {
            int[][] puzzle = new int[9][9];
            for (int i = 0; i < 9; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    puzzle[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int[] hori = new int[9];
            int[] verti = new int[9];
            int[] square = new int[9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    hori[i] += puzzle[i][j];
                    verti[j] += puzzle[i][j];
                    square[(j / 3) + (i / 3 * 3)] += puzzle[i][j];
                }
            }
            boolean isRight = true;
            for (int i = 0; i < 9; i++) {
                if (hori[i] != 45 || verti[i] != 45 || square[i] != 45) {
                    isRight = false;
                }
            }
            System.out.println("#" + test_case + " " + ((isRight) ? 1 : 0));
        }
    }
}