package silver.v.no1427;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> num = new ArrayList<>();
        int input = System.in.read();
        while (input != '\n') {
            num.add(input & 15);
            input = System.in.read();
        }
        Collections.sort(num, Collections.reverseOrder());
        for (int n : num) {
            System.out.print(n);
        }
    }
}