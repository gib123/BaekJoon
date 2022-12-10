package silver.v.no11651;

public class Point implements Comparable<Point> {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p) {
        if (this.y != p.y) return this.y - p.y;
        else return this.x - p.x;
    }

    public String toString() {
        return x + " " + y + "\n";
    }
}