package bronze.ii.no2292;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int i;
        for (i = 0; 3 * i * i + 3 * i + 1 < N; i++);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write((i + 1) + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}