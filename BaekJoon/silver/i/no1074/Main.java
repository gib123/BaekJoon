package silver.i.no1074;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        br.close();
        System.out.println(recur(Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2])));
    }

    public static int recur(int n, int r, int c) {
        if (n == 0) return 0;
        int half = (1 << n - 1);
        if (r < half && c < half) return recur(n - 1, r, c);
        if (r < half && c >= half) return half * half + recur(n - 1, r, c - half);
        if (r >= half && c < half) return 2 * half * half + recur(n - 1, r - half, c);
        return 3 * half * half + recur(n - 1, r - half, c - half);
    }
}