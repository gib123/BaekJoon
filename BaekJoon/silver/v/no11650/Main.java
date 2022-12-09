package silver.v.no11650;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = nextInt();
        ArrayList<Point> point = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            point.add(new Point(nextInt(), nextInt()));
        }
        Collections.sort(point);
        StringBuilder sb = new StringBuilder();
        for (Point p : point) {
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
            else if (input >= 48 && input <= 57) {
                n = (n << 3) + (n << 1) + (input & 15);
            } else return (isNeg) ? n * (-1) : n;
        }
    }
}

class Point implements Comparable<Point>{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p) {
        if (this.x != p.x) return this.x - p.x;
        else return this.y - p.y;
    }

    public String toString() {
        return x + " " + y + "\n";
    }
}