package bronze.v.no24568;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());
        System.out.println(R * 8 + S * 3 - 28);
        br.close();
    }
}