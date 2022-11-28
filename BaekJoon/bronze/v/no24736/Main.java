package bronze.v.no24736;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum1 = countScore(new StringTokenizer(br.readLine()));
        int sum2 = countScore(new StringTokenizer(br.readLine()));
        System.out.println(sum1 + " " + sum2);

        br.close();
    }

    public static int countScore(StringTokenizer st) {
        int sum = 0;
        sum += 6 * Integer.parseInt(st.nextToken());
        sum += 3 * Integer.parseInt(st.nextToken());
        sum += 2 * Integer.parseInt(st.nextToken());
        sum += 1 * Integer.parseInt(st.nextToken());
        sum += 2 * Integer.parseInt(st.nextToken());
        return sum;
    }
}