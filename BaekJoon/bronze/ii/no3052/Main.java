package bronze.ii.no3052;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] remainder = new int[42];
        for (int i = 0; i < 10; i++) {
            remainder[Integer.parseInt(br.readLine()) % 42]++;
        }

        int count = 0;
        for (int i = 0; i < remainder.length; i++) {
            if (remainder[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}