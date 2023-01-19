package basic100.no1076;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = (sc.next()).charAt(0);
        sc.close();

        for(int i = 'a'; i <= ch; i++) {
            System.out.printf("%c ", i);
        }
        System.out.println();
    }
}
