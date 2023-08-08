package silver.ii.no2630;

import java.io.*;
import java.util.*;

public class Main {
    static int[][] paper;
    static int[] colors = new int[2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];
        for (int i = 0; i < paper.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < paper[i].length; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        calculate(N, 0, 0);
        for (int color : colors) {
            System.out.println(color);
        }
    }

    public static void calculate(int N, int R, int C) {
        if (N == 0) {
            return;
        }
        int start = paper[R][C];
        boolean different = false;
        for (int i = R; i < R + N; i++) {
            for (int j = C; j < C + N; j++) {
                if (start != paper[i][j]) {
                    different = true;
                    break;
                }
            }
        }
        if (different) {
            N /= 2;
            for (int i = 0; i < 4; i++) {
                calculate(N, R + N * (i / 2), C + N * (i % 2));
            }
        } else {
            colors[start]++;
        }
    }
}