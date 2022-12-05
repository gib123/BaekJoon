package silver.iv.no2941;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            boolean isAlpha = false;
            for (int j = 0; j < alpha.length && i < str.length(); j++) {
                for (int k = 0; k < alpha[j].length() && i + k < str.length(); k++) {
                    if (str.charAt(i + k) != alpha[j].charAt(k)) {
                        break;
                    } else if (k + 1 == alpha[j].length()) {
                        isAlpha = true;
                        i += k;
                    }
                }
                if (isAlpha) {
                    count++;
                    break;
                }
            }
            if (!isAlpha) {
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