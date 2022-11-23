package bronze.v.no11382;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long sum = 0;
        while (st.hasMoreTokens()) {
            sum += Long.parseLong(st.nextToken());
        }
        System.out.println(sum);
        br.close();
    }
}