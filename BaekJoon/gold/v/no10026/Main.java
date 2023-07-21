package gold.v.no10026;

import java.io.*;

public class Main {
    static char[][] picture;
    static int N;
    static int[] dirR = {-1, 1, 0, 0};
    static int[] dirC = {0, 0, -1, 1};
    static boolean[][] visitedYes;
    static boolean[][] visitedNo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        picture = new char[N + 2][N + 2];
        for (int i = 1; i < N + 1; i++) {
            String str = br.readLine();
            for (int j = 1; j < N + 1; j++) {
                picture[i][j] = str.charAt(j - 1);
            }
        }
        visitedYes = new boolean[N + 2][N + 2];
        visitedNo = new boolean[N + 2][N + 2];
        int yesCount = 0;
        int noCount = 0;
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                if (!visitedYes[i][j]) {
                    searchYes(i, j, picture[i][j]);
                    yesCount++;
                }
                if (!visitedNo[i][j]) {
                    searchNo(i, j, picture[i][j]);
                    noCount++;
                }
            }
        }
        System.out.println(yesCount + " " + noCount);
    }

    public static void searchYes(int r, int c, char color) {
        visitedYes[r][c] = true;
        for (int i = 0; i < 4; i++) {
            int curR = r + dirR[i];
            int curC = c + dirC[i];
            if (!visitedYes[curR][curC] && picture[curR][curC] == color) {
                searchYes(curR, curC, picture[curR][curC]);
            }
        }
    }

    public static void searchNo(int r, int c, char color) {
        visitedNo[r][c] = true;
        for (int i = 0; i < 4; i++) {
            int curR = r + dirR[i];
            int curC = c + dirC[i];
            if (!visitedNo[curR][curC] && ((picture[curR][curC] == color) ||
                    (color == 'R' && picture[curR][curC] == 'G') || (color == 'G' && picture[curR][curC] == 'R'))) {
                searchNo(curR, curC, picture[curR][curC]);
            }
        }
    }

}