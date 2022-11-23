package bronze.v.no10699;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        today.add(Calendar.HOUR, 3);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(dateFormat.format(today.getTime()));
    }
}