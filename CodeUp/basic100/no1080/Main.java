package basic100.no1080;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int i, sum = 0;
        for(i = 1; i <= n; i++) {
            sum += i;
            if(sum >= n) {
                break;
            }
        }

        System.out.println(i);
    }
}
