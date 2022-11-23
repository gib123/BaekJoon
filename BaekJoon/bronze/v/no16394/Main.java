package bronze.v.no16394;

import java.util.Scanner;

public class Main {
    public static final int FOUNDYEAR = 1946;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(year - FOUNDYEAR);
        sc.close();
    }
}