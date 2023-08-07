package gold.iii.no9466;

import java.io.*;
import java.util.*;

public class Main {

    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] num = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < num.length; j++) {
                num[j] = Integer.parseInt(st.nextToken());
            }
            boolean[] cycle = new boolean[num.length];
            boolean[] visited = new boolean[num.length];
            count = 0;
            for (int j = 0; j < N; j++) {
                if (cycle[j]) continue;
                dfs(j + 1, cycle, num, visited);
            }
            sb.append((N - count) + "\n");
        }
        System.out.print(sb);
    }

    public static void dfs(int now, boolean[] cycle, int[] num, boolean[] visited) {
        if (visited[now - 1]) {
            return;
        }
        visited[now - 1] = true;
        int next = num[now - 1];

        if (!visited[next - 1]) {
            dfs(next, cycle, num, visited);
        } else {
            if (!cycle[next - 1]) {
                count++;
                for (int i = next; i != now; i = num[i - 1]) {
                    count++;
                }
            }
        }
        cycle[now - 1] = true;
    }
}