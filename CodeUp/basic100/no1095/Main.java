package basic100.no1095;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 999;
        int[] call = new int[n];
        for(int i = 0; i < n; i++) {
            call[i] = sc.nextInt();
            if(call[i] < min)
                min = call[i];
        }

        System.out.println(min);
    }
}
