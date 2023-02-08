package D3.no1208;

import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int test_case = 1; test_case <= 10; test_case++) {
            int count = Integer.parseInt(br.readLine());
            String[] stHeight = br.readLine().split(" ");
            int[] height = new int[100];
            for (int i = 0; i < 100; i++) {
                height[i] = Integer.parseInt(stHeight[i]);
            }
            int gap = Integer.MAX_VALUE;
            while (true) {
                int maxIndex = 0;
                int minIndex = 0;
                for (int i = 0; i < 100; i++) {
                    if (height[i] > height[maxIndex]) {
                        maxIndex = i;
                    }
                    if (height[i] < height[minIndex]) {
                        minIndex = i;
                    }
                }
                gap = height[maxIndex] - height[minIndex];
                if (count <= 0 || gap <= 1) {
                    break;
                }
                height[maxIndex]--;
                height[minIndex]++;
                count--;
            }
            System.out.println("#" + test_case + " " + gap);
        }
    }
}