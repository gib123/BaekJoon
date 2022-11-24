package bronze.v.no8437;

import java.math.BigInteger;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger total = new BigInteger(br.readLine());
        BigInteger howManyMore = new BigInteger(br.readLine());
        System.out.println(total.add(howManyMore).divide(BigInteger.valueOf(2)));
        System.out.println(total.subtract(howManyMore).divide(BigInteger.valueOf(2)));
        br.close();
    }
}