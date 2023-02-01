package silver.ii.no1406;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        LinkedList<Character> list = new LinkedList<>();
        for (char ch : str) {
            list.add(ch);
        }
        ListIterator<Character> iter = list.listIterator();
        while (iter.hasNext()) {
            iter.next();
        }
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String tmp = br.readLine();
            char command = tmp.charAt(0);
            if (command == 'L') {
                if (iter.hasPrevious()) iter.previous();
            }
            if (command == 'D') {
                if (iter.hasNext()) iter.next();
            }
            if (command == 'B') {
                if (iter.hasPrevious()) {
                    iter.previous();
                    iter.remove();
                }
            }
            if (command == 'P') {
                char addCh = tmp.charAt(2);
                iter.add(addCh);
            }
        }
        br.close();
        StringBuilder sb = new StringBuilder();
        for (char ch : list) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}