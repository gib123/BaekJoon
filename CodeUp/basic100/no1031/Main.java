package basic100.no1031;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octal;

        octal = Integer.toOctalString(sc.nextInt());

        System.out.println(octal);
    }
}
