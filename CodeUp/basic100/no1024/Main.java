package basic100.no1024;

import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word;

        word = br.readLine();

        for(int i = 0; i < word.length(); i++) {
            bw.write("'" + word.charAt(i) + "'" + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
