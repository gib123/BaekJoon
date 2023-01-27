package bronze.iii.no2576;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int min = 100;
        for (int i = 0; i < 7; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if (tmp % 2 != 0) {
                sum += tmp;
                if (tmp < min) min = tmp;
            }
        }
        br.close();
        if (sum == 0) System.out.println(-1);
        else {
            System.out.println(sum + "\n" + min);
        }
    }
}