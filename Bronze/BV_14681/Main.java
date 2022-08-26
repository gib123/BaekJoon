import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int qua = 0;
        if (x > 0 && y > 0)
            qua = 1;
        else if (x < 0 && y > 0)
            qua = 2;
        else if (x < 0 && y < 0)
            qua = 3;
        else
            qua = 4;

        System.out.println(qua);
    }

}