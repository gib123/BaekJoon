package D3.no6808;

import java.util.*;
import java.io.*;

class Solution {
    static int winCount;
    static int loseCount;
    static int[] iCards = new int[9];
    static int[] kCards = new int[9];
    static boolean[] selected = new boolean[9];

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean[] cards = new boolean[19];
            for (int i = 0; i < 9; i++) {
                kCards[i] = Integer.parseInt(st.nextToken());
                cards[kCards[i]] = true;
            }
            int j = 0;
            for (int i = 1; i < 19; i++) {
                if (!cards[i]) {
                    iCards[j++] = i;
                }
            }
            winCount = 0;
            loseCount = 0;
            play(0, 0, 0);
            System.out.println("#" + test_case + " " + winCount + " " + loseCount);
        }
    }

    public static void play(int n, int kScore, int iScore) {
        if (n == 9) {
            if (kScore > iScore) {
                winCount++;
            }
            if (kScore < iScore) {
                loseCount++;
            }
            return;
        }
        for (int i = 0; i < 9; i++) {
            if (selected[i]) continue;
            selected[i] = true;
            if (kCards[n] > iCards[i]) {
                play(n + 1, kScore + kCards[n] + iCards[i], iScore);
            } else {
                play(n + 1, kScore, iScore + kCards[n] + iCards[i]);
            }
            selected[i] = false;
        }
    }
}