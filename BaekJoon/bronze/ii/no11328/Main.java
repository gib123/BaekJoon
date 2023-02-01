package bronze.ii.no11328;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            if (str[0].length() != str[1].length()) {
                sb.append("Impossible\n");
                continue;
            }
            int[] arr1 = new int[26];
            int[] arr2 = new int[26];
            for (int j = 0; j < str[0].length(); j++) {
                arr1[str[0].charAt(j) - 'a']++;
                arr2[str[1].charAt(j) - 'a']++;
            }
            boolean isSame = true;
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] != arr2[j]) {
                    isSame = false;
                    sb.append("Impossible\n");
                    break;
                }
            }
            if (isSame) sb.append("Possible\n");
        }
        br.close();
        System.out.println(sb);
    }
}