package basic100.no1022;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;

        s = br.readLine();
        bw.write(s);
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }
}