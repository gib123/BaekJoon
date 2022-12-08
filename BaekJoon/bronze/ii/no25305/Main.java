package bronze.ii.no25305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int N = Integer.parseInt(num[0]);
        int k = Integer.parseInt(num[1]);
        String[] scoreTmp = br.readLine().split(" ");
        br.close();
        int[] score = new int[N];
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(scoreTmp[i]);
        }
        Arrays.sort(score);
        System.out.println(score[N - k]);
    }
}