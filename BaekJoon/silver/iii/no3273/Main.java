package silver.iii.no3273;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[Integer.parseInt(br.readLine())];
        String[] tmpNum = br.readLine().split(" ");
        for (int i = 0; i < tmpNum.length; i++) {
            num[i] = Integer.parseInt(tmpNum[i]);
        }
        int x = Integer.parseInt(br.readLine());
        br.close();
        int count = 0;
        boolean[] bolNum = new boolean[2000001];
        for (int i = 0; i < num.length; i++) {
            if (x > num[i] && bolNum[x - num[i]]) count++;
            bolNum[num[i]] = true;
        }
        System.out.println(count);
    }
}