package silver.ii.no18870;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = nextInt(br);
        int[] arr = new int[N];
        int[] sortArr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = nextInt(br);
            sortArr[i] = arr[i];
        }
        Arrays.sort(sortArr);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for (int n : sortArr) {
            if (!map.containsKey(n)) map.put(n, rank++);
        }
        StringBuilder sb = new StringBuilder();
        for (int n : arr) {
            sb.append(map.get(n)).append(" ");
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static int nextInt(BufferedReader br) throws IOException {
        int n = 0;
        boolean isNeg = false;
        while (true) {
            int input = br.read();
            if (input == '-') isNeg = true;
            else if (input >= '0' && input <= '9') {
                n = (n << 3) + (n << 1) + (input & 15);
            } else return (isNeg) ? ~n + 1 : n;
        }
    }
}