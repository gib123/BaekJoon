package bronze.i.no10989;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[10000];
        for (int i = 0; i < N; i++) {
            num[Integer.parseInt(br.readLine()) - 1]++;
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < num.length; i++) {
            if (num[i] > 0) bw.write(((i + 1) + "\n").repeat(num[i]));
        }
        bw.flush();
        bw.close();
    }
}