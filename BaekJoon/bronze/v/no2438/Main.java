package bronze.v.no2438;

import java.io.*;

public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++)
                bw.write("*");
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }

}