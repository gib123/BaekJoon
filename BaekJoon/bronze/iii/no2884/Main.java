package bronze.iii.no2884;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int H, M;
        Scanner sc = new Scanner(System.in);

        H = sc.nextInt();
        M = sc.nextInt();

        AlarmTime alarm = new AlarmTime();
        alarm.setTime(H, M);

        System.out.println(alarm.getHour() + " " + alarm.getMin());

        sc.close();
    }

}