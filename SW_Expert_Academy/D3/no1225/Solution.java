package D3.no1225;

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int test_case = 1; test_case <= 10; test_case++) {
            br.readLine();
            Queue<Integer> q = new ArrayDeque();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 8; i++) {
                q.offer(Integer.parseInt(st.nextToken()));
            }
            int num = 0;
            int ele = 0;
            do {
                num = (num >= 5) ? 1 : num + 1;
                ele = q.poll();
                q.offer((ele <= num) ? 0 : ele - num);
            } while (ele > num);
            StringBuilder sb = new StringBuilder();
            for (int e : q) {
                sb.append(e + " ");
            }
            System.out.println("#" + test_case + " " + sb);
        }
    }
}