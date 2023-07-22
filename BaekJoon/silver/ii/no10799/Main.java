package silver.ii.no10799;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int top = 0;
        int result = 0;
        int ans = 0;
        int prev = 0;
        while ((ans = System.in.read()) != '\n') {
            if (ans == '(') {
                top++;
            } else {
                top--;
                result += (prev == '(') ? top : 1;
            }
            prev = ans;
        }
        System.out.println(result);
    }
}