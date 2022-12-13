package silver.v.no1436;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        int c = 1;
        int n = 666;
        while (c < N) {
            n++;
            int tmp = n;
            while (tmp > 0) {
                if (tmp % 1000 == 666) {
                    c++;
                    break;
                }
                tmp /= 10;
            }
        }
        System.out.println(n);
    }
}