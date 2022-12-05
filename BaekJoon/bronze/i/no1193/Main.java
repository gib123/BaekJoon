package bronze.i.no1193;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int groupNum = 1;
        int lastNum = 1;
        for (int i = 2; lastNum < X; i++) {
            lastNum += i;
            groupNum++;
        }
        StringBuffer sb = new StringBuffer();
        if (groupNum % 2 == 0) {
            sb.append(groupNum - lastNum + X).append("/").append(lastNum - X + 1);
        } else {
            sb.append(lastNum - X + 1).append("/").append(groupNum - lastNum + X);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}