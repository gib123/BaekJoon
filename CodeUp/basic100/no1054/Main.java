package basic100.no1054;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        if(a == 1 && b == 1) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }

        sc.close();
    }
}
