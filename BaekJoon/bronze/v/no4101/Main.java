package bronze.v.no4101;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            if (n1 == 0 && n2 == 0) {
                break;
            }

            String answer = (n1 > n2) ? "Yes" : "No";
            System.out.println(answer);
        }
    }
}