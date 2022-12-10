package silver.v.no11651;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = nextInt();
        ArrayList<Point> pointArray = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            pointArray.add(new Point(nextInt(), nextInt()));
        }
        Collections.sort(pointArray);
        StringBuilder sb = new StringBuilder();
        for (Point p : pointArray) {
            sb.append(p.toString());
        }
        System.out.println(sb);
    }

    public static int nextInt() throws IOException {
        int n = 0;
        boolean isNeg = false;
        while (true) {
            int input = System.in.read();
            if (input == '-') isNeg = true;
            else if (input >= '0' && input <= '9') {
                n = (n << 3) + (n << 1) + (input & 15);
            } else return (isNeg) ? n * (-1) : n;
        }
    }
}