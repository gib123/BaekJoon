package basic100.no1067;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if(n >= 0) {
            System.out.println("plus");
        }else {
            System.out.println("minus");
        }

        if(n % 2 == 0) {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
