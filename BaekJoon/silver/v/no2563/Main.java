package silver.v.no2563;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        boolean[][] paper = new boolean[100][100];
        int count = 0;
        for (int i = 0; i < num; i++) {
            String[] loc = br.readLine().split(" ");
            int x = Integer.parseInt(loc[0]);
            int y = Integer.parseInt(loc[1]);
            for (int j = y; j < y + 10; j++) {
                for (int k = x; k < x + 10; k++) {
                    if (!paper[j][k]) {
                        paper[j][k] = true;
                        count++;
                    }
                }
            }
        }
        br.close();
        System.out.println(count);
    }
}