package bronze.iii.no2442;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N + i; j++) {
                sb.append((j < N - i - 1) ? " " : "*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}