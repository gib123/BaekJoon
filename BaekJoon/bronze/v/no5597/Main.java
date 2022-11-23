package bronze.v.no5597;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] submit = new int[30];
        int submitLen = submit.length;
        for (int i = 0; i < submitLen; i++) {
            submit[i] = 0;
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < submitLen - 2; i++) {
            submit[Integer.parseInt(br.readLine()) - 1] = 1;
        }

        for (int i = 0; i < submitLen; i++) {
            if (submit[i] == 0) {
                System.out.println(i + 1);
            }
        }
    }
}