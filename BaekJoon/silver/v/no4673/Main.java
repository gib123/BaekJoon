package silver.v.no4673;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean[] selfNum = new boolean[10000];
        Arrays.fill(selfNum, false);
        for (int i = 1; i < 10000; i++) {
            int sum = i + digitSum(i);
            if (sum <= 10000) {
                selfNum[sum - 1] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 10000; i++) {
            if (!selfNum[i]) {
                sb.append(i + 1).append("\n");
            }
        }
        System.out.print(sb);
    }

    public static int digitSum(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + digitSum(num / 10);
    }
}