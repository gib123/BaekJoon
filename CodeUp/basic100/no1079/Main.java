package basic100.no1079;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch;
        do{
            ch = (sc.next()).charAt(0);
            System.out.println(ch);
        }while(ch != 'q');

        sc.close();
    }
}
