import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int asciiValue = sc.nextLine().charAt(0);
        System.out.println(asciiValue);
        sc.close();
    }
}