package silver.iv.no10845;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int size = 0;
        int back = -1;
        for (int i = 0; i < N; i++) {
            String[] com = br.readLine().split(" ");
            if (com[0].equals("push")) {
                back = Integer.parseInt(com[1]);
                queue.offer(back);
                size++;
            }
            if (com[0].equals("pop")) {
                if (size > 0) {
                    sb.append(queue.poll() + "\n");
                    size--;
                    back = (size == 0) ? -1 : back;
                } else sb.append("-1\n");
            }
            if (com[0].equals("size")) {
                sb.append(size + "\n");
            }
            if (com[0].equals("empty")) {
                sb.append(((size == 0) ? 1 : 0) + "\n");
            }
            if (com[0].equals("front")) {
                sb.append(((size > 0) ? queue.peek() : -1) + "\n");
            }
            if (com[0].equals("back")) {
                sb.append(back + "\n");
            }
        }
        br.close();
        System.out.println(sb);
    }
}