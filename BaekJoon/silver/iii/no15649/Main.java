package silver.iii.no15649;

import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        visited = new boolean[N + 1];
        print(0);
        System.out.println(sb);
    }

    public static void print(int c) {
        if (c == M) {
            for (int i = 0; i < M; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                arr[c] = i;
                visited[i] = true;
                print(c + 1);
                visited[i] = false;
            }
        }
    }
}