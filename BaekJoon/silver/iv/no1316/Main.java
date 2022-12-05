package silver.iv.no1316;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < num; i++) {
            int[] alpha = new int[26];
            String str = br.readLine();
            char pre = str.charAt(0);
            boolean isGroup = true;
            for (int j = 0; j < str.length(); j++) {
                char cur = str.charAt(j);
                if (alpha[cur - 'a'] != 0 && pre != cur) {
                    isGroup = false;
                    break;
                } else {
                    alpha[cur - 'a'] = 1;
                    pre = cur;
                }
            }
            if (isGroup) {
                count++;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(count + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}