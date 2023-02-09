package gold.iv.no15683;

import java.io.*;
import java.util.*;

public class Main {
    static int[] xDir = {-1, 0, 1, 0};
    static int[] yDir = {0, 1, 0, -1};
    static int[][] office;
    static int[][] officeTmp;
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        office = new int[N][M];
        ArrayList<int[]> cctv = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                office[i][j] = Integer.parseInt(st.nextToken());
                if (office[i][j] != 0 && office[i][j] != 6) cctv.add(new int[] {i, j});
            }
        }
        int[] cctvDir = new int[cctv.size()];
        int totalCount = 1 << cctv.size() * 2;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < totalCount; i++) {
            officeTmp = new int[N][M];
            int dirTmp = i;
            for (int j = 0; j < cctv.size(); j++) {
                cctvDir[j] = dirTmp % 4;
                dirTmp /= 4;
            }
            for (int j = 0; j < cctv.size(); j++) {
                int num = office[cctv.get(j)[0]][cctv.get(j)[1]];
                range(cctvDir[j], cctv.get(j));
                if (num == 2) {
                    range((cctvDir[j] + 2) % 4, cctv.get(j));
                } else if (num == 3) {
                    range((cctvDir[j] + 1) % 4, cctv.get(j));
                } else if (num == 4) {
                    range((cctvDir[j] + 1) % 4, cctv.get(j));
                    range((cctvDir[j] + 2) % 4, cctv.get(j));
                } else if (num == 5) {
                    range((cctvDir[j] + 1) % 4, cctv.get(j));
                    range((cctvDir[j] + 2) % 4, cctv.get(j));
                    range((cctvDir[j] + 3) % 4, cctv.get(j));
                }
            }
            int count = 0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (office[j][k] == 0 && officeTmp[j][k] == 0) count++;
                }
            }
            if (count < min) min = count;
        }
        System.out.println(min);
    }

    public static void range(int dir, int[] cctv) {
        int x = cctv[0];
        int y = cctv[1];
        while (true) {
            x += xDir[dir];
            y += yDir[dir];
            if (x >= N || y >= M || x < 0 || y < 0) break;
            if (office[x][y] == 6) break;
            if (office[x][y] == 0) officeTmp[x][y] = 7;
        }
    }
}