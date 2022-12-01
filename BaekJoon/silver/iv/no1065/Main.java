package silver.iv.no1065;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        if (N < 100) {
            count = N;
        } else {
            count = 99;
            for (int i = 100; i <= N; i++) {
                if (checkIsAP(i)) {
                    count++;
                }
            }
        }
        System.out.println(count);
        br.close();
    }

    public static boolean checkIsAP(int num) {
        ArrayList<Integer> digitOfNum = new ArrayList<>();
        while (num > 0) {
            digitOfNum.add(num % 10);
            num /= 10;
        }
        int gap = digitOfNum.get(0) - digitOfNum.get(1);
        for (int i = 1; i < digitOfNum.size() - 1; i++) {
            if (gap != digitOfNum.get(i) - digitOfNum.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}