package silver.iv.no10866;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String[] com = br.readLine().split(" ");
            if (com[0].equals("push_front")) deque.addFirst(Integer.parseInt(com[1]));
            else if (com[0].equals("push_back")) deque.addLast(Integer.parseInt(com[1]));
            else if (com[0].equals("pop_front")) sb.append(((deque.size() == 0) ? -1 : deque.removeFirst()) + "\n");
            else if (com[0].equals("pop_back")) sb.append(((deque.size() == 0) ? -1 : deque.removeLast()) + "\n");
            else if (com[0].equals("size")) sb.append(deque.size() + "\n");
            else if (com[0].equals("empty")) sb.append(((deque.size() == 0) ? 1 : 0) + "\n");
            else if (com[0].equals("front")) sb.append(((deque.size() == 0) ? -1 : deque.getFirst()) + "\n");
            else if (com[0].equals("back")) sb.append(((deque.size() == 0) ? -1 : deque.getLast()) + "\n");
        }
        br.close();
        System.out.println(sb);
    }
}