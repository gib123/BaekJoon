package bronze.ii.no2577;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        br.close();
        int[] num = new int[10];
        while (total > 0) {
            num[total % 10]++;
            total /= 10;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            sb.append(num[i] + "\n");
        }
        System.out.println(sb);
    }
}