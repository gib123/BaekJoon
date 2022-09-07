import java.io.*;

public class Main {
    public static final int maxSpeed = 5;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());

        if ((L % maxSpeed) == 0) {
            System.out.println(L / maxSpeed);
        }else {
            System.out.println((L / maxSpeed) + 1);
        }
        br.close();
    }
}