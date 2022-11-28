package bronze.iii.no2588;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n1, n2;
        Scanner s = new Scanner(System.in);

        n1 = s.nextInt();
        n2 = s.nextInt();

        System.out.println(n1 * (n2 % 10) + "\n" + n1 * (n2 % 100 / 10) + "\n" + n1 * (n2 / 100) + "\n" + n1 * n2);
    }

}