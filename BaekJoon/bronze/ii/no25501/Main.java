package bronze.ii.no25501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] testCase = new String[N];
        for (int i = 0; i < N; i++) {
            testCase[i] = br.readLine();
        }
        br.close();
        StringBuilder sb = new StringBuilder();
        for (String t : testCase) {
            sb.append(isPalindrome(t)).append(" ").append(count).append("\n");
            count = 0;
        }
        System.out.println(sb);
    }

    public static int isPalindrome(String s) {
        count++;
        return recursion(s, 0, s.length() - 1);
    }

    public static int recursion(String s, int l, int r) {
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else {
            count++;
            return recursion(s, l + 1, r - 1);
        }
    }
}