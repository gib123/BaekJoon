package bronze.iii.no2562;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n, max = -1, maxIndex = 0;
        int i;

        for(i = 0; i < 9; i++) {
            n = Integer.parseInt(br.readLine());
            if (n >= max) {
                max = n;
                maxIndex = i;
            }
        }

        bw.write(max + "\n" + (maxIndex + 1) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

}