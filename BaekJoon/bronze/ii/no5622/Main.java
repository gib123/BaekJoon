package bronze.ii.no5622;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] time = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7,
                8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
        int totalTime = 0;
        int input = 0;
        while ((input = System.in.read()) != '\n') {
            totalTime += time[input - 'A'];
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(totalTime + "\n");
        bw.flush();
        bw.close();
    }
}