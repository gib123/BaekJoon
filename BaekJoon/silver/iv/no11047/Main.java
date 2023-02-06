package silver.iv.no11047;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        int[] coin = new int[N];
        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        int totalNum = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (K == 0) break;
            if (coin[i] <= K) {
                totalNum += (K / coin[i]);
                K %= coin[i];
            }
        }
        System.out.println(totalNum);
    }
}