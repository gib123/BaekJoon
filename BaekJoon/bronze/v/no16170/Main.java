package bronze.v.no16170;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.add(Calendar.HOUR, -9);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy\nMM\ndd");
        System.out.println(dateFormat.format(date.getTime()));
    }
}