import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] curPieceCnt = new int[6];
        for(int i = 0; i < 6; i++) {
            curPieceCnt[i] = sc.nextInt();
        }
        sc.close();
        int[] originalPieceCnt = {1, 1, 2, 2, 2, 8}; //king, queen, rook, bishop, knight, pawn
        for(int i = 0; i < 6; i++) {
            System.out.print(originalPieceCnt[i] - curPieceCnt[i] + " ");
        }
        System.out.println();
    }
}