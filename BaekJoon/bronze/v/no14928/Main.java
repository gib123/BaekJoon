package bronze.v.no14928;

import java.io.*;

public class Main {
    public static final int BIRTHDAY = 20000303;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        int remain = 0;
        for(int i = 0; i < N.length(); i++) {
            remain = (remain * 10 + (N.charAt(i) - '0')) % BIRTHDAY;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(remain + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}