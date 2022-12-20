package basic100.no1027;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int y, m, d;

        StringTokenizer st = new StringTokenizer(br.readLine(), ".");
        y = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        bw.write(String.format("%02d-%02d-%04d", d, m, y) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
