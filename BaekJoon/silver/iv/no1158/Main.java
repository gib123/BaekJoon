package silver.iv.no1158;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        String[] tmp = br.readLine().split(" ");
        br.close();
        int N = Integer.parseInt(tmp[0]);
        for (int i = 0; i < N; i++) {
            list.add(i + 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int K = Integer.parseInt(tmp[1]);
        int idx = 0;
        while (N > 0) {
            idx = (idx + (K - 1)) % (N--);
            sb.append(list.remove(idx));
            if (N != 0) sb.append(", ");
        }
        sb.append(">");
        System.out.println(sb);
    }
}