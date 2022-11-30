package bronze.ii.no8958;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(calScore(br.readLine()) + "\n");
        }
        System.out.println(sb);
        br.close();
    }

    public static int calScore(String quizResult) {
        int total = 0;
        int prev = 0;
        for (int i = 0; i < quizResult.length(); i++) {
            if (quizResult.charAt(i) == 'O') {
                if (prev > 0) {
                    total += (prev + 1);
                    prev += 1;
                } else {
                    total += 1;
                    prev = 1;
                }
            } else {
                prev = 0;
            }
        }
        return total;
    }
}