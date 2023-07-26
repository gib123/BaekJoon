package D2.no1204;

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= T; test_case++) {
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] grade = new int[101];
            for (int i = 0; i < 1000; i++) {
                grade[Integer.parseInt(st.nextToken())]++;
            }
            int freq = grade[0];
            int idx = 0;
            for (int i = 0; i < grade.length; i++) {
                if (grade[i] == freq && i > idx) {
                    idx = i;
                }
                if (grade[i] > freq) {
                    freq = grade[i];
                    idx = i;
                }
            }
            System.out.println("#" + test_case + " " + idx);
        }
    }
}