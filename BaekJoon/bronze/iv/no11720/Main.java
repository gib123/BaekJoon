package bronze.iv.no11720;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String numbers = br.readLine();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += numbers.charAt(i) - '0';
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sum + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}