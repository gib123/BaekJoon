package bronze.ii.no1152;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        char ch = (char)System.in.read();
        char pre = ' ';
        int count = 0;
        while (ch != '\n') {
            if (ch == ' ' && pre != ' ') {
                count++;
            }
            pre = ch;
            ch = (char)System.in.read();
        }
        count += (pre != ' ') ? 1 : 0;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}