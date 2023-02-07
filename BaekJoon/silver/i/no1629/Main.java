package silver.i.no1629;

import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        br.close();
        BigInteger A = new BigInteger(tmp[0]);
        BigInteger B = new BigInteger(tmp[1]);
        BigInteger C = new BigInteger(tmp[2]);
        System.out.println(A.modPow(B, C));
    }
}