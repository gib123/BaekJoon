package bronze.iii.no2490;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[3][];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            arr[i] = br.readLine().split(" ");
            int count = 0;
            for (int j = 0; j < 4; j++) {
                if (arr[i][j].equals("0")) count++;
            }
            switch (count) {
                case 0: sb.append("E\n"); break;
                case 1: sb.append("A\n"); break;
                case 2: sb.append("B\n"); break;
                case 3: sb.append("C\n"); break;
                case 4: sb.append("D\n"); break;
            }
        }
        br.close();
        System.out.println(sb);
    }
}