package silver.iv.no4949;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sen;
        StringBuilder sb = new StringBuilder();
        while (!(sen = br.readLine()).equals(".")) {
            Stack<Character> stack = new Stack<>();
            char[] word = sen.toCharArray();
            boolean isCorrect = true;
            for (int i = 0; i < word.length; i++) {
                if (word[i] == '(' || word[i] == '[') stack.push(word[i]);
                if (word[i] == ')' || word[i] == ']') {
                    if (stack.empty() || ((word[i] == ')' && stack.peek() != '(') || (word[i] == ']' && stack.peek() != '['))) {
                        isCorrect = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if (isCorrect && stack.empty()) sb.append("yes\n");
            else sb.append("no\n");
        }
        br.close();
        System.out.println(sb);
    }
}