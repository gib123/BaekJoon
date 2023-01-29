package bronze.iii.no1267;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        br.close();
        int sumY = 0;
        int sumM = 0;
        for (int i = 0; i < N; i++) {
            int time = Integer.parseInt(str[i]);
            sumY += (time / 30 + 1) * 10;
            sumM += (time / 60 + 1) * 15;
        }
        System.out.println((sumY < sumM) ? "Y " + sumY : ((sumM < sumY) ? "M " + sumM : "Y M " + sumY));
    }
}