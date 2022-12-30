package basic100.no1068;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        sc.close();

        if(score >= 90 && score <= 100) {
            System.out.println("A");
        } else if(score >= 70 && score <= 89) {
            System.out.println("B");
        } else if(score >= 40 && score <= 69) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
