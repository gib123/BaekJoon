package silver.v.no2581;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        br.close();
        int minPrime = 0;
        int totalPrime = 0;
        boolean firstPrime = false;
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                totalPrime += i;
                if (!firstPrime) {
                    minPrime = i;
                    firstPrime = true;
                }
            }
        }
        if (!firstPrime) {
            System.out.println(-1);
        } else {
            System.out.println(totalPrime + "\n" + minPrime);
        }
    }

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        } else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}