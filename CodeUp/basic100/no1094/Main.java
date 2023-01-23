package basic100.no1094;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] call = new int[n];
        for(int i = 0; i < n; i++)
            call[i] = sc.nextInt();

        for(int i = n - 1; i >= 0; i--)
            System.out.print(call[i] + " ");
        System.out.println();
    }
}
