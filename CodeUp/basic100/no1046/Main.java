package basic100.no1046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println(a + b + c);
        System.out.printf("%.1f\n", (double)(a + b + c) / 3);

        sc.close();
    }
}
