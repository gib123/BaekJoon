package bronze.ii.no2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        boolean exist = false;
        for (int i = 1; i < N; i++) {
            if (i + sum(i) == N) {
                exist = true;
                System.out.println(i);
                break;
            }
        }
        if (!exist) System.out.println(0);
    }

    public  static int sum(int n) {
        if (n == 0) return 0;
        return (n % 10) + sum(n / 10);
    }
}