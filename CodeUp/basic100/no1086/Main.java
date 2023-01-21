package basic100.no1086;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        double mb = (double)w * h * b / 8 / 1024 / 1024;
        System.out.format("%.2f MB\n", mb);
    }
}
