package bronze.v.no2475;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        for(int i = 0; i < 5; i++) {
            number[i] = sc.nextInt();
        }
        int numVerify = 0;
        for(int i = 0; i < 5; i++) {
            numVerify += number[i] * number[i];
        }
        numVerify %= 10;
        System.out.println(numVerify);
        sc.close();
    }
}