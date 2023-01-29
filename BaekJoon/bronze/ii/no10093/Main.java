package bronze.ii.no10093;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        long A = Long.parseLong(str[0]);
        long B = Long.parseLong(str[1]);
        if (A > B) {
            long tmp = A;
            A = B;
            B = tmp;
        }
        StringBuilder sb = new StringBuilder();
        if (A == B) sb.append("0\n");
        else sb.append(B - A - 1 + "\n");
        for (long i = A + 1; i < B; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}