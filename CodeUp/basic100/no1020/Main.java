package basic100.no1020;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[]args)throws IOException {
        int a, b;
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, "-");
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        bw.write(String.format("%06d%06d", a, b) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}