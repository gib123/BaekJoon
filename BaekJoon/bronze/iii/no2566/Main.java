package bronze.iii.no2566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[9][];
        for (int i = 0; i < 9; i++) {
            arr[i] = br.readLine().split(" ");
        }
        br.close();

        int maxRow = 1;
        int maxCol = 1;
        int max = Integer.parseInt(arr[0][0]);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(arr[i][j]);
                if (num > max) {
                    max = num;
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(maxRow + " " + maxCol);
    }
}