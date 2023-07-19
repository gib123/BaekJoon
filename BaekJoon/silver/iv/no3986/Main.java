package silver.iv.no3986;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            char[] arr = new char[word.length()];
            int top = 0;
            for (int j = 0; j < word.length(); j++) {
                if (top == 0 || arr[top - 1] != word.charAt(j)) {
                    arr[top++] = word.charAt(j);
                } else {
                    top--;
                }
            }
            if (top == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}