package bronze.v.no17256;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = input(new int[3], br);
        int[] c = input(new int[3], br);

        System.out.println((c[0] - a[2]) + " " + (c[1] / a[1]) + " " + (c[2] - a[0]));
        br.close();
    }

    public static int[] input(int[] arr, BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }
}