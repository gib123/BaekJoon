package basic100.no1088;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i = 0; i < n; i++) {
            if((i + 1) % 3 == 0) {
                continue;
            }
            System.out.print(i + 1 + " ");
        }
        System.out.println();
    }
}
