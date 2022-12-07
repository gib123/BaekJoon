package silver.iii.no1929;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int M = Integer.parseInt(num[0]);
        int N = Integer.parseInt(num[1]);
        boolean[] notPrime = new boolean[N + 1];
        notPrime[0] = notPrime[1] = true;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (!notPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    notPrime[j] = true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = M; i <= N; i++) {
            if (!notPrime[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}