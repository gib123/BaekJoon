package basic100.no1053;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        a = sc.nextInt();

        if(a == 1){
            System.out.println(0);
        }else {
            System.out.println(1);
        }

        sc.close();
    }
}
