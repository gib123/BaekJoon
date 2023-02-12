package silver.v.no11728;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = nextInt();
        int M = nextInt();
        int[] A = new int[N];
        int[] B = new int[M];
        for (int i = 0; i < N; i++) {
            A[i] = nextInt();
        }
        for (int i = 0; i < M; i++) {
            B[i] = nextInt();
        }
        int[] C = new int[N + M];
        int a = 0;
        int b = 0;
        for (int i = 0; i < N + M; i++) {
            if (b == M) C[i] = A[a++];
            else if (a == N) C[i] = B[b++];
            else if (A[a] < B[b]) C[i] = A[a++];
            else C[i] = B[b++];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N + M; i++) {
            sb.append(C[i] + " ");
        }
        System.out.println(sb);
    }

    public static int nextInt() throws IOException {
        int n = 0;
        boolean isNeg = false;
        while (true) {
            int input = System.in.read();
            if (input == '-') isNeg = true;
            else if (input >= '0' && input <= '9') {
                n = (n << 3) + (n << 1) + (input & 15);
            } else return (isNeg) ? -n : n;
        }
    }
}