package D3.no1244;

import java.io.*;

class Solution {
    static int exchangeNum;
    static int answer;
    static int[] num;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++) {
            String[] str = br.readLine().split(" ");
            exchangeNum = Integer.parseInt(str[1]);
            num = new int[str[0].length()];
            for (int i = 0; i < str[0].length(); i++) {
                num[i] = str[0].charAt(i) - '0';
            }
            answer = Integer.MIN_VALUE;
            dfs(0, 0);
            if (answer == Integer.MIN_VALUE) {
                if (exchangeNum % 2 != 0) {
                    swap(num.length - 2, num.length - 1);
                }
                String strNum = "";
                for (int e : num) {
                    strNum += e;
                }
                answer = Integer.parseInt(strNum);
            }
            System.out.println("#" + test_case + " " + answer);
        }
    }

    public static void dfs(int startIndex, int count) {
        String strNum = "";

        if (exchangeNum == count) {
            for (int e : num) {
                strNum += e;
            }
            if (Integer.parseInt(strNum) > answer) {
                answer = Integer.parseInt(strNum);
            }
            return;
        }

        for (int i = startIndex; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] <= num[j]) {
                    swap(i, j);
                    dfs(i, count + 1);
                    swap(i, j);
                }
            }
        }
    }

    public static void swap(int i, int j) {
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }
}