package silver.ii.no11279;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (maxheap.isEmpty()) sb.append("0\n");
                else sb.append(maxheap.poll() + "\n");
            } else maxheap.add(x);
        }
        br.close();
        System.out.println(sb);
    }
}