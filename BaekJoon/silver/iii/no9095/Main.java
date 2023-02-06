package silver.iii.no9095;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] test = new int[T];
        for (int i = 0; i < T; i++) {
            test[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        int[] num = new int[11];
        num[1] = 1;
        num[2] = 2;
        num[3] = 4;
        for (int i = 4; i <= num.length - 1; i++) {
            num[i] = num[i - 1] + num[i - 2] + num[i - 3];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            sb.append(num[test[i]] + "\n");
        }
        System.out.println(sb);
    }
}