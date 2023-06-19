package silver.ii.no1874;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[N];
        int num = 0;
        int top = 0;
        for (int i = 0; i < N; i++) {
            int seq = Integer.parseInt(br.readLine());
            if (top == 0 || num < seq) {
                while (num < seq) {
                    arr[top++] = ++num;
                    sb.append("+\n");
                }
            }
            int pop = arr[--top];
            if (pop == seq) {
                sb.append("-\n");
            } else if (pop > seq) {
                sb = new StringBuilder("NO\n");
                break;
            }
        }
        System.out.println(sb);
    }
}