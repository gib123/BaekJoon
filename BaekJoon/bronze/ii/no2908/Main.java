package bronze.ii.no2908;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int A = (System.in.read() - '0')  + 10 * (System.in.read() - '0') + 100 * (System.in.read() - '0');
        System.in.read();
        int B = (System.in.read() - '0')  + 10 * (System.in.read() - '0') + 100 * (System.in.read() - '0');
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf((A > B) ? A : B));
        bw.flush();
        bw.close();
    }
}