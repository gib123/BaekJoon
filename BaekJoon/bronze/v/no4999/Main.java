package bronze.v.no4999;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int heLen = br.readLine().length();
        int doctorLen = br.readLine().length();

        String result = (heLen >= doctorLen) ? "go" : "no";
        System.out.println(result);
        br.close();
    }
}