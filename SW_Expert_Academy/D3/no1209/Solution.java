package D3.no1209;

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int test_case = 1; test_case <= 10; test_case++) {
            br.readLine();
            int[][] arr = new int[100][100];
            for (int i = 0; i < 100; i++) {
                String[] tmp = br.readLine().split(" ");;
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = Integer.parseInt(tmp[j]);
                }
            }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < 100; i++) {
                int sum = 0;
                for(int j = 0; j < 100; j++) {
                    sum += arr[i][j];
                }
                if (sum > max) max = sum;
            }
            for (int j = 0; j < 100; j++) {
                int sum = 0;
                for (int i = 0; i < 100; i++) {
                    sum += arr[i][j];
                }
                if (sum > max) max = sum;
            }
            int sum = 0;
            int opSum = 0;
            for (int i = 0; i < 100; i++) {
                sum += arr[i][i];
                opSum += arr[i][99 - i];
            }
            if (sum > max) max = sum;
            if (opSum > max) max = opSum;

            System.out.println("#" + test_case + " " + max);
        }
    }
}