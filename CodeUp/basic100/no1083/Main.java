package basic100.no1083;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            if(i == 3 || i == 6 || i == 9)
                System.out.print("X ");
            else
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
