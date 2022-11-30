package bronze.iii.no10818;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N, i, max = -1000001, min = 1000001;
        int[] array= new int[1000001];

        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            if(array[i] >= max)
                max = array[i];
            if(array[i] <= min)
                min = array[i];
        }

        bw.write(min + " " + max + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

}