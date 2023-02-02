package silver.iv.no10828;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String[] stack = new String[N];
        int top = 0;
        for (int i = 0; i < N; i++) {
            String[] com = br.readLine().split(" ");
            if (com[0].equals("push")) stack[top++] = com[1];
            if (com[0].equals("pop")) {
                if (top == 0) sb.append(-1 + "\n");
                else sb.append(stack[--top] + "\n");
            }
            if (com[0].equals("size")) sb.append(top + "\n");
            if (com[0].equals("empty")) sb.append(((top == 0) ? 1 : 0) + "\n");
            if (com[0].equals("top")) sb.append(((top == 0) ? -1 : stack[top - 1]) + "\n");
        }
        br.close();
        System.out.println(sb);
    }
}