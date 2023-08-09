package gold.iv.no2448;

import java.io.*;
import java.util.*;

class Main {
    static char[][] stars;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        stars = new char[N][N * 2];
        for (char[] star : stars) {
            Arrays.fill(star, ' ');
        }
        recur(N, 0, N - 1);
        StringBuilder sb = new StringBuilder();
        for (char[] star : stars) {
            for (char s : star) {
                sb.append(s);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void recur(int N, int R, int C) {
        if (N == 3) {
            stars[R][C] = '*';
            stars[R + 1][C - 1] = '*';
            stars[R + 1][C + 1] = '*';
            for (int i = C - 2; i < C + 3; i++) {
                stars[R + 2][i] = '*';
            }
            return;
        }
        N /= 2;
        recur(N, R, C);
        recur(N, R + N, C - N);
        recur(N, R + N, C + N);
    }
}