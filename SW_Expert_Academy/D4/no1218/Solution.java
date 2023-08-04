package D4.no1218;

import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int test_case = 1; test_case <= 10; test_case++) {
            int N = Integer.parseInt(br.readLine());
            String str = br.readLine();
            int[] stack = new int[N + 1];
            int top = 0;
            boolean isValid = true;
            for (int i = 0; i < N; i++) {
                char ch = str.charAt(i);
                if (ch == '(' || ch == '{' || ch == '[' || ch == '<') {
                    stack[top++] = ch;
                } else {
                    if (top == 0) {
                        isValid = false;
                        break;
                    }
                    switch(ch) {
                        case ')':
                            if (stack[top - 1] == '(') top--;
                            else isValid = false;
                            break;
                        case ']':
                            if (stack[top - 1] == '[') top--;
                            else isValid = false;
                            break;
                        case '}':
                            if (stack[top - 1] == '{') top--;
                            else isValid = false;
                            break;
                        case '>':
                            if (stack[top - 1] == '<') top--;
                            else isValid = false;
                            break;
                    }
                }
                if (!isValid) break;
            }
            System.out.println("#" + test_case + " " + ((isValid && top == 0) ? 1 : 0));
        }
    }
}