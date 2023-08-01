package D4.no1210;

import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int test_case = 1; test_case <= 10; test_case++) {
            br.readLine();
            char[][] ladder = new char[100][100];
            int[] loc = new int[2];
            for (int i = 0; i < ladder.length; i++) {
                String str = br.readLine();
                for (int j = 0; j < ladder.length; j++) {
                    ladder[i][j] = str.charAt(j * 2);
                    if (ladder[i][j] == '2') {
                        loc = new int[] {i, j};
                    }
                }
            }
            int[] dirR = {0, 0, -1};
            int[] dirC = {-1, 1, 0};
            while (loc[0] != 0) {
                for (int i = 0; i < dirR.length; i++) {
                    int curR = loc[0] + dirR[i];
                    int curC = loc[1] + dirC[i];
                    if (curR < 0 || curR >= ladder.length || curC < 0 || curC >= ladder.length) continue;
                    if (ladder[curR][curC] == '1') {
                        loc[0] = curR;
                        loc[1] = curC;
                        ladder[curR][curC] = '2';
                        break;
                    }
                }
            }
            System.out.println("#" + test_case + " " + loc[1]);
        }
    }
}