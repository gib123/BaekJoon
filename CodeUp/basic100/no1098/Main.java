package basic100.no1098;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] board = new int[h][w];
        for(int i = 0; i < h; i++)
            for(int j = 0; j < w; j++)
                board[i][j] = 0;

        int l, d, x, y;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            l = sc.nextInt();
            d = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();

            if(d == 0)
                for(int j = y; j < y + l; j++)
                    board[x - 1][j - 1] = 1;
            else
                for(int j = x; j < x + l; j++)
                    board[j - 1][y - 1] = 1;
        }

        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }
}
