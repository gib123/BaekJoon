package gold.v.no2447;

import java.io.*;

public class Main {
    static char[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        arr = new char[N][N];
        draw(N, 0, 0, false);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (char[] ch : arr) {
            bw.write(ch);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    public static void draw(int N, int x, int y, boolean isBlank) {
        if (N == 1) {
            if (isBlank) arr[x][y] = ' ';
            else arr[x][y] = '*';
            return;
        }
        int count = 0;
        for (int i = x; i < x + N; i += N / 3) {
            for (int j = y; j < y + N; j += N / 3) {
                count++;
                draw(N / 3, i, j, (isBlank || count == 5));
            }
        }
    }
}