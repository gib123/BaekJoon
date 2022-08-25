import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N, X;
        int i, j;
        String s;
        int[] A = new int[10001];
        int[] A2 = new int[10001];

        s = br.readLine();
        StringTokenizer st1 = new StringTokenizer(s);
        N = Integer.parseInt(st1.nextToken());
        X = Integer.parseInt(st1.nextToken());
        s = br.readLine();
        StringTokenizer st2 = new StringTokenizer(s);
        for(i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st2.nextToken());
        }

        j = 0;
        for(i = 0; i < N; i++) {
            if(A[i] < X) {
                A2[j] = A[i];
                j++;
            }
        }

        for(i = 0; i < j; i++)
            bw.write(A2[i] + " ");
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }

}