package bronze.i.no1157;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] alphaCount = new int[26];
        for (int ch = System.in.read(); ch >= 'A'; ch = System.in.read()) {
            if (ch <= 'Z') {
                alphaCount[ch - 'A']++;
            } else {
                alphaCount[ch - 'a']++;
            }
        }

        int max = -1;
        int maxIdx = 0;
        for (int i = 0; i < alphaCount.length; i++) {
            if (alphaCount[i] > max) {
                max = alphaCount[i];
                maxIdx = i;
            } else if (alphaCount[i] == max) {
                maxIdx = -2;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write((char)(maxIdx + 'A') + "\n");
        bw.flush();
        bw.close();
    }
}