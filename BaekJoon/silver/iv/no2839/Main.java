package silver.iv.no2839;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int totalNum = 0;
        for (int i = N / 5; i >= 0; i--) {
            int tmpN = N - 5 * i;
            if (tmpN == 0) {
                totalNum = i;
                break;
            } else if (tmpN % 3 == 0) {
                totalNum = i + (tmpN / 3);
                break;
            }
            totalNum = -1;
        }
        if (N < 5) {
            if (N % 3 == 0) {
                totalNum = N / 3;
            } else {
                totalNum = -1;
            }
        }
        System.out.println(totalNum);
    }
}