package basic100.no1090;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

        long num = 1;
        for(int i = 0; i < n - 1; i++)
            num *= r;
        System.out.println(a * num);
    }
}
