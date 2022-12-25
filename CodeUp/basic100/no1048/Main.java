package basic100.no1048;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a * 1<<b);

        sc.close();
    }
}
