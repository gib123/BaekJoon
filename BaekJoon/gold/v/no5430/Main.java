package gold.v.no5430;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String num = br.readLine();
            StringTokenizer st = new StringTokenizer(num.substring(1, num.length() - 1), ",");
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int front = 0;
            int rear = n;
            int now = front;
            boolean hasError = false;
            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == 'R') {
                    now = (now == front) ? rear - 1 : front;
                }
                if (p.charAt(j) == 'D') {
                    if (front == rear) {
                        sb.append("error\n");
                        hasError = true;
                        break;
                    } else {
                        if (now == front) {
                            front++;
                            now++;
                        } else {
                            rear--;
                            now--;
                        }
                    }
                }
            }
            if (!hasError) {
                sb.append("[");
                if (now == front) {
                    for (int j = now; j < rear; j++) {
                        sb.append(arr[j] + ((j != rear - 1) ? "," : ""));
                    }
                } else {
                    for (int j = now; j >= front; j--) {
                        sb.append(arr[j] + ((j != front) ? "," : ""));
                    }
                }
                sb.append("]\n");
            }
        }
        System.out.println(sb);
    }
}