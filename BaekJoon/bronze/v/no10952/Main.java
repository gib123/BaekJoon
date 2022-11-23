package bronze.v.no10952;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A, B;
        do
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            if(A != 0 && B != 0)
                bw.write(A + B + "\n");
        }while(A != 0 && B != 0);
        bw.flush();
        bw.close();
        br.close();
    }

}