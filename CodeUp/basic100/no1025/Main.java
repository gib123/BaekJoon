package basic100.no1025;

import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n;

        n = Integer.parseInt(br.readLine());

        bw.write("[" + n / 10000 * 10000 + "]\n");
        bw.write("[" + n % 10000 / 1000 * 1000 + "]\n");
        bw.write("[" + n % 10000 % 1000 / 100 * 100 + "]\n");
        bw.write("[" + n % 10000 % 1000 % 100 / 10 * 10+ "]\n");
        bw.write("[" + n % 10000 % 1000 % 100 % 10 + "]\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
