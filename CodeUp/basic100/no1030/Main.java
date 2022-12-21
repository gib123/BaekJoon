package basic100.no1030;

import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n;

        n = Long.parseLong(br.readLine());
        bw.write(n + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
