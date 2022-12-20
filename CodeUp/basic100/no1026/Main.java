package basic100.no1026;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int h, m, s;

        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        h = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        bw.write(m + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
