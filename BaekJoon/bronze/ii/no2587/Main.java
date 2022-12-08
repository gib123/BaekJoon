package bronze.ii.no2587;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static final int COUNT = 5;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[COUNT];
        for (int i = 0; i < COUNT; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        int total = 0;
        for (int n : num) {
            total += n;
        }
        int avg = total / COUNT;
        System.out.println(avg);

        Arrays.sort(num);
        System.out.println(num[(int)Math.ceil(COUNT / 2)]);
    }
}