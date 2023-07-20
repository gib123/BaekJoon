package silver.i.no2504;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int total = 0;
        int part = 1;
        char[] stack = new char[str.length() + 1];
        int top = 0;
        char prev = ' ';
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[') {
                part *= (ch == '(') ? 2 : 3;
                stack[top++] = ch;
            }
            if (ch == ')' || ch == ']') {
                if (top == 0 || (ch == ')' && stack[top - 1] != '(')
                        || (ch == ']' && stack[top - 1] != '[')) {
                    total = 0;
                    break;
                }
                if ((ch == ')' && prev == '(') || (ch == ']' && prev == '[')) {
                    total += part;
                }
                top--;
                part /= (ch == ')') ? 2 : 3;
            }
            prev = ch;
        }
        System.out.println((top == 0) ? total : 0);
    }
}