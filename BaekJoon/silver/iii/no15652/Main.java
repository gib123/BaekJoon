package silver.iii.no15652;

import java.io.*;
import java.util.*;

class Main {
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        char[] arr = new char[2 * M];
        Arrays.fill(arr, ' ');
        recur(0, 0, arr);
        System.out.print(sb);
    }

    public static void recur(int n, int start, char[] arr) {
        if (n == M) {
            sb.append(arr).append("\n");
            return;
        }
        for (int i = start; i < N; i++) {
            arr[n * 2] = (char)(i + 1 + '0');
            recur(n + 1, i, arr);
        }
    }
}