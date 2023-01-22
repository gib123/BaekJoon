package basic100.no1091;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        for(int i = 0; i < n - 1; i++)
            a = a * m + d;
        System.out.println(a);
    }
}
