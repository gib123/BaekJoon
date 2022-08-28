import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buddhismYear = sc.nextInt();
        int adYear = buddhismYear - 543;
        System.out.println(adYear);
        sc.close();
    }
}