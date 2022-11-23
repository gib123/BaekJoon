package bronze.v.no20492;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int prizeMoney = Integer.parseInt(br.readLine());
        int caseOne = prizeMoney - (prizeMoney / 100 * 22);
        int caseTwo = prizeMoney - ((prizeMoney / 100 * 20) / 100 * 22);
        System.out.println(caseOne + " " + caseTwo);
        br.close();
    }
}