package basic100.no1078;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int i = 1, sum = 0;
        while(i <= n){
            if(i % 2 == 0) {
                sum += i;
            }
            i++;
        }

        System.out.println(sum);
    }
}
