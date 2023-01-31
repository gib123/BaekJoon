package silver.v.no1475;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] num = new int[10];
        int input = 0;
        while ((input = System.in.read() & 15) >= 0 && input <= 9) {
            num[input]++;
        }
        num[6] = (num[6] + num[9] + 1) / 2;
        int max = num[0];
        for (int i = 0; i < 9; i++) {
            if (num[i] > max) max = num[i];
        }
        System.out.println(max);
    }
}