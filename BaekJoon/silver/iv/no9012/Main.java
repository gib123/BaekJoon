package silver.iv.no9012;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String line = br.readLine();
            int top = 0;
            for (int j = 0; j < line.length(); j++) {
                top = (line.charAt(j) == '(') ? top + 1 : top - 1;
                if (top == -1) {
                    break;
                }
            }
            sb.append((top == 0) ? "YES\n" : "NO\n");
        }
        System.out.println(sb);
    }
}