package basic100.no1028;

import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long num;

        num = Long.parseLong(br.readLine());
        bw.write(num + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
