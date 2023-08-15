package D3.no9229;

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] weight = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                weight[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(weight);
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    int w = weight[i] + weight[j];
                    if (w > M) break;
                    if (w > max) {
                        max = w;
                    }
                }
            }
            System.out.println("#" + test_case + " " + ((max == Integer.MIN_VALUE) ? -1 : max));
        }
    }
}