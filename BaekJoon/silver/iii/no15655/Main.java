package silver.iii.no15655;

import java.io.*;
import java.util.*;

class Main {
    static int M;
    static int[] nums;
    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        nums = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        recur(0, 0, new int[M]);
        System.out.println(sb);
    }

    public static void recur(int n, int start, int[] seq) {
        if (n == M) {
            for (int e : seq) {
                sb.append(e + " ");
            }
            sb.append("\n");
            return;
        }
        for (int i = start; i < nums.length; i++) {
            seq[n] = nums[i];
            recur(n + 1, i + 1, seq);
        }
    }
}