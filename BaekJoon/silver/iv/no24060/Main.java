package silver.iv.no24060;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int count = 0;
    static int K = 0;
    static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = nextInt(br);
        K = nextInt(br);
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = nextInt(br);
        }
        mergeSort(A, 0, A.length - 1);
        if (K > count) result = -1;
        System.out.println(result);
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

    public static void mergeSort(int[] A, int s, int e) {
        if (result != 0) return;
        if(s < e) {
            int m = (s + e) / 2;
            mergeSort(A, s, m);
            mergeSort(A, m + 1, e);
            merge(A, s, e);
        }
    }

    public static void merge(int[] A, int s, int e) {
        if (result != 0) return;
        Arrays.sort(A, s, e + 1);
        if (K - count <= e - s + 1) {
            result = A[K - count - 1 + s];
        }
        count += e - s + 1;
    }
}