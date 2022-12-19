package basic100.no1019;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[]args)throws IOException {
        int y, m, d;
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, ".");
        y = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        bw.write(String.format("%04d.%02d.%02d", y, m, d) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}