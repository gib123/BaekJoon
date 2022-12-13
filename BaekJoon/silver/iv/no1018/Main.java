package silver.iv.no1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        int[][] count = new int[N][M - 7];
        for (int i = 0; i < N; i++) {
            String board = br.readLine();
            for (int j = 0; j < M - 7; j++) {
                for (int k = j; k < j + 8; k++) {
                    count[i][j] += (board.charAt(k) == 'W') ? (i + k) % 2 : (i + k + 1) % 2;
                }
            }
        }
        br.close();
        int min = 64;
        for (int j = 0; j < M - 7; j++) {
            for (int i = 0; i < N - 7; i++) {
                int sum = 0;
                for (int k = i; k < i + 8; k++) {
                    sum += count[k][j];
                }
                sum = (sum > 32) ? 64 - sum : sum;
                min = (sum < min) ? sum : min;
            }
        }
        System.out.println(min);
    }
}