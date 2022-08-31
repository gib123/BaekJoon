import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger[] score = new BigInteger[5];
        for (int i = 0; i < 5; i++) {
            score[i] = new BigInteger(sc.nextLine());
        }
        sc.close();

        BigInteger totalScore = BigInteger.ZERO;
        for (int i = 0; i < 5; i++) {
            totalScore  = totalScore.add(score[i]);
        }
        System.out.println(totalScore);
    }
}