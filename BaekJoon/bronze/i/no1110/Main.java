package bronze.i.no1110;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int nPlace1, nPlace2, N, original_N = 0, count = 0;

        N = Integer.parseInt(br.readLine());

        original_N = N;
        while(true) {
            if(N / 10 < 1)
                nPlace1 = 0;
            else
                nPlace1 = N / 10;
            nPlace2 = N % 10;

            N = 10 * nPlace2 + ((nPlace1 + nPlace2) % 10);
            count++;

            if(N == original_N)
                break;
        }

        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

}