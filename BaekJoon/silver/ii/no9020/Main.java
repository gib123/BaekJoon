package silver.ii.no9020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] checkPrime = new boolean[9997];
        for (int i = 2; i <= 9998; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                checkPrime[i - 2] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = n / 2; j >= 2; j--) {
                if (checkPrime[j - 2] && checkPrime[n - j - 2]) {
                    sb.append(j + " " + (n - j) + "\n");
                    break;
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}