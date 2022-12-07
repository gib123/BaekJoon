package silver.ii.no4948;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        while ((num = Integer.parseInt(br.readLine())) != 0) {
            System.out.println(countPrime(num));
        }
        br.close();
    }

    public static int countPrime(int n) {
        int count = 0;
        for (int i = n + 1; i <= 2 * n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            count += (isPrime) ? 1 : 0;
        }
        return count;
    }
}