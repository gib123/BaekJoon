package silver.ii.no1780;

import java.io.*;
import java.util.*;

public class Main {
    static int[] number = new int[3];
    static int[][] paper;

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
        recur(N, 0, 0);
        for (int n : number) {
            System.out.println(n);
        }
    }

    public static void recur(int N, int startR, int startC) {
        if (N == 0) {
            return;
        }
        boolean different = false;
        int prev = paper[startR][startC];
        for (int i = startR; i < startR + N; i++) {
            for (int j = startC; j < startC + N; j++) {
                if (paper[i][j] != prev) {
                    different = true;
                }
            }
        }
        if (different) {
            N /= 3;
            for (int i = 0; i < 9; i++) {
                recur(N, startR + N * (i / 3), startC + N * (i % 3));
            }
        } else {
            number[prev + 1]++;
        }
    }
}