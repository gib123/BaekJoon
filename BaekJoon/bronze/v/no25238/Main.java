package bronze.v.no25238;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double realA = a / 100 * (100 - b);
        if (100 <= realA) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
        br.close();
    }
}