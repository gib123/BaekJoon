package bronze.iii.no2445;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2 * N - 1; i++) {
            int tmpI = (i < N) ? i : i - 2 * (i - N + 1);
            for (int j = 0; j < tmpI + 1; j++) {
                sb.append("*");
            }
            for (int j = 0; j < 2 * (N - 1 - tmpI); j++) {
                sb.append(" ");
            }
            for (int j = 0; j < tmpI + 1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}