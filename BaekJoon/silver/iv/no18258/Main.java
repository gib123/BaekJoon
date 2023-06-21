package silver.iv.no18258;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int front = 0;
        int rear = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) {
                arr[rear++] = Integer.parseInt(st.nextToken());
            } else  {
                if (command.equals("pop")) {
                    sb.append((front == rear) ? -1 : arr[front++]);
                }
                if (command.equals("size")) {
                    sb.append(rear - front);
                }
                if (command.equals("empty")) {
                    sb.append((front == rear) ? 1 : 0);
                }
                if (command.equals("front")) {
                    sb.append((front == rear) ? -1 : arr[front]);
                }
                if (command.equals("back")) {
                    sb.append((front == rear) ? -1 : arr[rear - 1]);
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}