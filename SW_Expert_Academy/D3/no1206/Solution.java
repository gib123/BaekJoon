package D3.no1206;

import java.io.*;

public class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int test_case = 1; test_case <= 10; test_case++) {
            int N = Integer.parseInt(br.readLine());
            String[] strHeight = br.readLine().split(" ");
            int[] height = new int[N];
            for (int i = 0; i < N; i++) {
                height[i] = Integer.parseInt(strHeight[i]);
            }
            int[] dir = {-1, -2, 1, 2};
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (height[i] == 0) continue;
                if (height[i] <= height[i - 1] || height[i] <= height[i - 2] || height[i] <= height[i + 1] || height[i] <= height[i + 2]) continue;
                int max = Integer.MIN_VALUE;
                for (int j = 0; j < 4; j++) {
                    if (height[i + dir[j]] > max) max = height[i + dir[j]];
                }
                count += (height[i] - max);
            }
            System.out.println("#" + test_case + " " + count);
        }
    }
}