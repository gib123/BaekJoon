package silver.v.no7568;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = read();
        int[][] info = new int[N][2];
        for (int i = 0; i < N; i++) {
            info[i][0] = read();
            info[i][1] = read();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (info[i][0] < info[j][0] && info[i][1] < info[j][1]) count++;
            }
            sb.append(count).append(" ");
        }
        System.out.println(sb);
    }

    public static int read() throws IOException {
        int n = 0;
        while (true) {
            int input = System.in.read();
            if (input >= '0' && input <= '9') {
                n = (n << 3) + (n << 1) + (input & 15);
            } else return n;
        }
    }
}