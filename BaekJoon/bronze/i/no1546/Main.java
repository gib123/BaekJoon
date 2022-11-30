package bronze.i.no1546;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double [] scores = new double[N];
        for (int i = 0; i < N; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(scores);
        double maxScore = scores[N - 1];
        double total = 0;
        for (int i = 0; i < N; i++) {
            total += scores[i] / maxScore * 100;
        }
        double average = total / N;
        System.out.println(average);
        br.close();
    }
}