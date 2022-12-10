package silver.v.no10814;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = nextInt(br);
        StringBuilder[] mem = new StringBuilder[200];
        for (int i = 0; i < N; i++) {
            int age = nextInt(br);
            if (mem[age - 1] == null) mem[age - 1] = new StringBuilder();
            mem[age - 1].append(age).append(" ").append(br.readLine()).append("\n");
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (StringBuilder sb : mem) {
            if (sb != null) bw.write(sb.toString());
        }
        bw.flush();
        bw.close();
    }

    public static int nextInt(BufferedReader br) throws IOException {
        int n = 0;
        while (true) {
            int input = br.read();
            if (input >= '0' && input <= '9') {
                n = (n << 3) + (n << 1) + (input & 15);
            } else return n;
        }
    }
}