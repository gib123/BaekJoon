package bronze.ii.no2675;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String[] token = br.readLine().split(" ");
            int R = Integer.parseInt(token[0]);
            for (int j = 0; j < token[1].length(); j++) {
                for (int k = 0; k < R; k++) {
                    sb.append(token[1].charAt(j));
                }
            }
            sb.append("\n");
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
        br.close();
    }
}