package bronze.ii.no2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = nextInt(br);
        int M = nextInt(br);
        int[] card = new int[N];
        for (int i = 0; i < N; i++) {
            card[i] = nextInt(br);
        }
        br.close();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = card[i] + card[j] + card[k];
                    if (sum > max && sum <= M) max = sum;
                }
            }
        }
        System.out.println(max);
    }

    public static int nextInt(BufferedReader br) throws IOException {
        int n = 0;
        while (true) {
            int input = br.read();
            if (input >= '0' && input <= '9') {
                n = (n << 3) + (n << 1) + (input & 15);
            } else return n;
        }
    }
}