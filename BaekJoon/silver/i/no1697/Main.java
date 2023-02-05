package silver.i.no1697;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stPos = br.readLine().split(" ");
        br.close();
        int N = Integer.parseInt(stPos[0]);
        int K = Integer.parseInt(stPos[1]);
        if (N == K) {
            System.out.println(0);
            return;
        }
        int[] time = new int[1000001];
        int[] dir = {-1, 1, 2};
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);
        while(!queue.isEmpty()) {
            int rmX = queue.poll();
            for(int j = 0; j < 3; j++) {
                int curX = (j == 2) ? rmX * dir[j] : rmX + dir[j];
                if (curX == K) {
                    System.out.println(time[rmX] + 1);
                    return;
                }
                if (curX < 0 || curX > 1000000) continue;
                if (curX == N || time[curX] > 0) continue;
                queue.offer(curX);
                time[curX] = time[rmX] + 1;
            }
        }
    }
}