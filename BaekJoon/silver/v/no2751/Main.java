package silver.v.no2751;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = nextInt();
        boolean[] num = new boolean[2000001];
        for (int i = 0; i < N; i++) {
            num[nextInt() + 1000000] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            if (num[i]) sb.append((i - 1000000) + "\n");
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static int nextInt() throws IOException {
        int n = 0;
        boolean isNeg = false;
        while (true) {
            int input = System.in.read();
            if (input == '-') {
                isNeg = true;
            } else if (input >= 48 && input <= 57) {
                n = (n << 3) + (n << 1) + (input & 15);
            } else {
                return (isNeg) ? n * (-1) : n;
            }
        }
    }
}