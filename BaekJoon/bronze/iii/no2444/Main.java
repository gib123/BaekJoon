package bronze.iii.no2444;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N + i; j++) {
                sb.append((j < N - 1 - i) ? " " : "*");
            }
            sb.append("\n");
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < 2 * N - 1 - i; j++) {
                sb.append((j < i) ? " " : "*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}