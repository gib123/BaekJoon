package silver.i.no1992;

import java.io.*;

public class Main {
    static String[] video;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        video = new String[N];
        for (int i = 0; i < video.length; i++) {
            video[i] = br.readLine();
        }
        zip(N, 0, 0);
        System.out.println(result);
    }

    public static void zip(int N, int R, int C) {
        if (N == 0) {
            return;
        }
        char start = video[R].charAt(C);
        boolean same = true;
        for (int i = R; i < R + N; i++) {
            for (int j = C; j < C + N; j++) {
                if (start != video[i].charAt(j)) {
                    same = false;
                }
            }
        }
        if (!same) {
            result.append("(");
            N /= 2;
            for (int i = 0; i < 4; i++) {
                zip(N, R + N * (i / 2), C + N * (i % 2));
            }
            result.append(")");
        } else {
            result.append(start);
        }
    }
}