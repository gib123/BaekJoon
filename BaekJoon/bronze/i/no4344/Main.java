package bronze.i.no4344;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        for (int i = 0; i < C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] scores = new int[N];
            int total = 0;
            for (int j = 0; j < N; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
                total += scores[j];
            }

            double average = (double)total / N;
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (scores[j] > average) {
                    count++;
                }
            }

            String rate = String.format("%.3f%%\n", (double)count / N * 100);
            sb.append(rate);
        }
        System.out.print(sb);
        br.close();
    }
}