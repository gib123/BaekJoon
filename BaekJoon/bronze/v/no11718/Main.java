package bronze.v.no11718;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = null;
        while ((input = br.readLine()) != null) {
            sb.append(input).append("\n");
        }
        System.out.println(sb.toString());
        br.close();
    }
}