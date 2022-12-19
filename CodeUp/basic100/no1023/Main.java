package basic100.no1023;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1, n2;

        StringTokenizer st = new StringTokenizer(br.readLine(), ".");
        n1 = Integer.parseInt(st.nextToken());
        n2 = Integer.parseInt(st.nextToken());

        bw.write(n1 + "\n" + n2 + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}