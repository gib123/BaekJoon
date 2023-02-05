package silver.iv.no1920;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strA = br.readLine().split(" ");
        HashSet<String> A = new HashSet<>();
        for (int i = 0; i < N; i++) {
            A.add(strA[i]);
        }
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String[] compare = br.readLine().split(" ");
        br.close();
        for (int i = 0; i < M; i++) {
            if (A.contains(compare[i])) sb.append("1\n");
            else sb.append("0\n");
        }
        System.out.println(sb);
    }
}