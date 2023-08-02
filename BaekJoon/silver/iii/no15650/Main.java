package silver.iii.no15650;

import java.io.*;
import java.util.*;

class Main {
    static StringBuilder sb = new StringBuilder();
    static int N;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        recur(0, M, new StringBuilder());
        System.out.println(sb);
    }

    public static void recur(int start, int M, StringBuilder temp) {
        if (M == 0) {
            sb.append(temp + "\n");
            return;
        }
        for (int i = start; i < N; i++) {
            temp.append((i + 1) + " ");
            recur(i + 1, M - 1, temp);
            temp.delete(temp.length() - 2, temp.length());
        }
    }
}