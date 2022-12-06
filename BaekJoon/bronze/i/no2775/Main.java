package bronze.i.no2775;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] countArr = new int[k + 1][n];
            countInhabitant(k, n, countArr);
            System.out.println(countArr[k][n - 1]);
        }
        br.close();
    }

    public static void countInhabitant(int k, int n, int[][] countArr) {
        for (int i = 0; i < k + 1; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    countArr[i][j] = j + 1;
                } else if (j == 0) {
                    countArr[i][j] = 1;
                } else {
                    countArr[i][j] = countArr[i][j - 1] + countArr[i - 1][j];
                }
            }
        }
    }
}