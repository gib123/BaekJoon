import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = new BigInteger(sc.next());
        BigInteger m = new BigInteger(sc.next());
        BigInteger perMoney = n.divide(m);
        BigInteger moneyLeft = n.remainder(m);
        System.out.println(perMoney + "\n" + moneyLeft);
        sc.close();
    }
}