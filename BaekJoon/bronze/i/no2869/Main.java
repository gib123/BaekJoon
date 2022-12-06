package bronze.i.no2869;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int days = 1 + (V - A) / (A - B) + ((((V - A) % (A - B)) != 0) ? 1 : 0);
        System.out.println(days);
        br.close();
    }
}