package silver.iii.no1021;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(i + 1);
        }
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int count = 0;
        int now = 0;
        for (int i = 0; i < M; i++) {
            int pickIdx = arr.indexOf(Integer.parseInt(st.nextToken()));
            int dis = Math.abs(now - pickIdx);
            int opDis = arr.size() - dis;
            count += (dis <= opDis) ? dis : opDis;
            arr.remove(pickIdx);
            now = pickIdx;
        }
        System.out.println(count);
    }
}