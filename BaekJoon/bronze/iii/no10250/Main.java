package bronze.iii.no10250;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            StringBuffer sb = new StringBuffer();
            if (N % H == 0) {
                sb.append(H);
                if (N / H < 10) {
                    sb.append(0).append(N / H);
                } else {
                    sb.append(N / H);
                }
            } else {
                sb.append(N % H);
                if (N / H + 1 < 10) {
                    sb.append(0).append(N / H + 1);
                } else {
                    sb.append(N / H + 1);
                }
            }
            System.out.println(sb);
        }
        br.close();
    }
}