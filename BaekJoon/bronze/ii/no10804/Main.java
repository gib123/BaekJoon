package bronze.ii.no10804;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] card = new int[20];
        for (int i = 0; i < 20; i++) {
            card[i] = i + 1;
        }
        for (int i = 0; i < 10; i++) {
            String[] sec = br.readLine().split(" ");
            int start = Integer.parseInt(sec[0]);
            int end = Integer.parseInt(sec[1]);
            int count = end - start + 1;
            for (int j = 0; j < count / 2; j++) {
                int tmp = card[start + j - 1];
                card[start + j - 1] = card[end - j - 1];
                card[end - j - 1] = tmp;
            }
        }
        br.close();
        StringBuilder sb = new StringBuilder();
        for (int e : card) {
            sb.append(e + " ");
        }
        System.out.println(sb);
    }
}