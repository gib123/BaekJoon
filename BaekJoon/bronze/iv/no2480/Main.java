package bronze.iv.no2480;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] dice = new int[6];
    static int diceLen = dice.length;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            dice[Integer.parseInt(st.nextToken()) - 1]++;
        }

        int total = 0;
        int maxNum = 0;
        for (int i = 0; i < diceLen; i++) {
            if (dice[i] == 1) {
                if (i + 1 > maxNum) {
                    maxNum = i + 1;
                }
            } else if (dice[i] == 2) {
                total = 1000 + (i + 1) * 100;
                break;
            } else if (dice[i] == 3) {
                total = 10000 + (i + 1) * 1000;
                break;
            }
        }
        if (total == 0) {
            total = maxNum * 100;
        }
        System.out.println(total);

        br.close();
    }
}