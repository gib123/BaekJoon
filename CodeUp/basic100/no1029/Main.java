package basic100.no1029;

import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double n;

        n = Double.parseDouble(br.readLine());
        bw.write(String.format("%.11f", n) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
