package bronze.iv.no15552;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args)throws IOException {
        int A, B, n, i;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(bf.readLine());

        for(i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            bw.write(A + B + "\n");
        }
        bw.flush();
        bw.close();
        bf.close();
    }
}