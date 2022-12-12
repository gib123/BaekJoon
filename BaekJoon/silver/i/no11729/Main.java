package silver.i.no11729;

import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        sb.append((1 << N) - 1).append("\n");
        move(N, 1, 2, 3);
        System.out.println(sb);
    }

    public static void move(int N, int s, int m, int e) {
        if (N == 1) {
            sb.append(s).append(" ").append(e).append("\n");
            return;
        }
        move(N - 1, s, e, m);
        sb.append(s).append(" ").append(e).append("\n");
        move(N - 1, m, s, e);
    }
}