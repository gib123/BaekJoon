package bronze.v.no1330;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String s;
        if (A > B)
            s = ">";
        else if (A < B)
            s = "<";
        else
            s = "==";
        System.out.println(s);
    }

}