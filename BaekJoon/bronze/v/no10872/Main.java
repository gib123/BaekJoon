package bronze.v.no10872;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int result = 1;
        for (int i = 0; i < num; i++) {
            result *= (i + 1);
        }
        System.out.println(result);
        br.close();
    }
}