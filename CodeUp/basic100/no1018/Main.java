package basic100.no1018;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[]args)throws IOException{
        int h, m;
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        s = br.readLine();

        bw.write(s + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}