package basic100.no1093;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] call = new int[n];
        int[] student = new int[23];
        for(int i = 0; i < 23; i++)
            student[i] = 0;
        for(int i = 0; i < n; i++) {
            call[i] = sc.nextInt();
            student[call[i] - 1]++;
        }

        for(int i = 0; i < 23; i++)
            System.out.print(student[i] + " ");
        System.out.println();
    }
}
