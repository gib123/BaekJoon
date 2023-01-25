package basic100.no1099;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];
        for(int i = 0; i < 10; i++)
            for(int j = 0; j < 10; j++)
                arr[i][j] = sc.nextInt();

        int x = 1;
        int y = 1;
        while(arr[x][y] == 0 || arr[x][y] == 2) {
            if(arr[x][y] == 2) {
                arr[x][y] = 9;
                break;
            }else
                arr[x][y] = 9;

            if(arr[x][y + 1] != 1 && x + 1 < 10)
                y++;
            else if(arr[x + 1][y] != 1 && x + 1 < 10)
                x++;
            else
                break;
        }

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
