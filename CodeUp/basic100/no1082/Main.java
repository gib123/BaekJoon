package basic100.no1082;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = Integer.valueOf(s, 16);
        sc.close();

        for(int i = 1; i < 16; i++) {
            System.out.format("%X*%X=%X\n", n, i, n * i);
        }
    }
}
