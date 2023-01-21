package basic100.no1085;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();
        sc.close();

        double mb = (double)h * b * c * s / 8 / 1024 / 1024;
        System.out.format("%.1f MB\n", mb);
    }
}
