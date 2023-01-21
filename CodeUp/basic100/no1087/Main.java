package basic100.no1087;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
            if(sum >= n) {
                break;
            }
        }

        System.out.println(sum);
    }
}
