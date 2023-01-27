package bronze.iv.no10808;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int[] count = new int[26];
        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 'a']++;
        }
        StringBuffer sb = new StringBuffer();
        for (int e : count) {
            sb.append(e + " ");
        }
        System.out.println(sb);
    }
}