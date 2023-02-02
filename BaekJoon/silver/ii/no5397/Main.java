package silver.ii.no5397;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            LinkedList<Character> list = new LinkedList<>();
            ListIterator<Character> iter = list.listIterator();
            char ch;
            while ((ch = (char)br.read()) != '\n') {
                if (ch == '>' && iter.hasNext()) iter.next();
                if (ch == '<' && iter.hasPrevious()) iter.previous();
                if (ch == '-' && iter.hasPrevious()) {
                    iter.previous();
                    iter.remove();
                }
                if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) iter.add(ch);
            }
            for (char c : list) {
                sb.append(c);
            }
            sb.append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}