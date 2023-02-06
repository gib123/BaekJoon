package bronze.iii.no9094;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            int count = 0;
            for (int j = 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int a = j;
                    int b = k;
                    if ((a * a + b * b + m) % (a * b) == 0) count++;
                }
            }
            sb.append(count + "\n");
        }
        br.close();
        System.out.println(sb);
    }
}