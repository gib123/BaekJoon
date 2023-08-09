package gold.iv.no9663;

import java.io.*;

class Main {
    static int N;
    static int count;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dfs(0, new boolean[N], new boolean[N * 2 - 1], new boolean[N * 2 - 1]);
        System.out.println(count);
    }

    public static void dfs(int n, boolean[] locC, boolean[] locD, boolean[] locSD) {
        if (n == N) {
            count++;
            return;
        }
        for (int c = 0; c < N; c++) {
            if (locC[c] || locD[c + n] || locSD[N - 1 + n - c]) continue;
            locC[c] = true;
            locD[c + n] = true;
            locSD[n - c + N - 1] = true;
            dfs(n + 1, locC, locD, locSD);
            locC[c] = false;
            locD[c + n] = false;
            locSD[n - c + N - 1] = false;
        }
    }
}