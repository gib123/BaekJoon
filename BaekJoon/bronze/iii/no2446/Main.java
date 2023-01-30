package bronze.iii.no2446;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2 * N - 1; i++) {
            int tmpI = (i < N) ? i : 2 * (N - 1) - i;
            for (int j = 0; j < 2 * N - tmpI - 1; j++) {
                sb.append((j < tmpI) ? " " : "*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}