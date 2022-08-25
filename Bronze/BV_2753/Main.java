import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        int Is_leapYear = 0;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            Is_leapYear = 1;
        else
            Is_leapYear = 0;
        System.out.println(Is_leapYear);
    }

}