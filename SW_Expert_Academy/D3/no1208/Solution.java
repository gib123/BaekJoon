package D3.no1208;

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int test_case = 1; test_case <= 10; test_case++) {
            int count = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] box = new int[100];
            for (int i = 0; i < 100; i++) {
                box[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(box);
            int diff = box[box.length - 1] - box[0];
            while (count-- > 0 && diff > 1) {
                box[box.length - 1]--;
                box[0]++;
                Arrays.sort(box);
                diff = box[box.length - 1] - box[0];
            }
            System.out.println("#" + test_case + " " + diff);
        }
    }
}