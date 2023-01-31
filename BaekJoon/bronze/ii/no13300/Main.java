package bronze.ii.no13300;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        int[][] stu = new int[6][2];
        for (int i = 0; i < N; i++) {
            int S = br.read() & 15;
            br.read();
            stu[(br.read() & 15) - 1][S]++;
            br.read();
        }
        br.close();
        int count = 0;
        for (int i = 0; i < stu.length; i++) {
            for (int j = 0; j < stu[i].length; j++) {
                count += (stu[i][j] + K - 1) / K;
            }
        }
        System.out.println(count);
    }
}