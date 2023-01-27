package bronze.i.no2309;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] hei = new int[9];
        int sum = 0;
        for (int i = 0; i < hei.length; i++) {
            hei[i] = Integer.parseInt(br.readLine());
            sum += hei[i];
        }
        br.close();
        Arrays.sort(hei);
        int i = 0;
        int j = 0;
        boolean find = false;
        for (i = 0; i < hei.length; i++) {
            for (j = i + 1; j < hei.length; j++) {
                if (sum - hei[i] - hei[j] == 100) {
                    find = true;
                    break;
                }
            }
            if (find) break;
        }
        for (int k = 0; k < hei.length; k++) {
            if (k != i && j != k) System.out.println(hei[k]);
        }
    }
}