package gold.v.no2493;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int top = 0;
        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(st.nextToken());
            while ((top != 0) && arr[top - 1][0] < now) {
                top--;
            }
            sb.append(((top == 0) ? "0" : arr[top - 1][1]) + " ");
            arr[top++] = new int[]{now, i + 1};
        }
        System.out.println(sb);
    }
}