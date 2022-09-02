import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int itemAmount = 0;
        for (int i = 0; i < N; i++) {
            String[] token = br.readLine().split(" ");
            itemAmount += Integer.parseInt(token[0]) * Integer.parseInt(token[1]);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (X == itemAmount) {
            bw.write("Yes\n");
        } else {
            bw.write("No\n");
        }
        bw.flush();
        bw.close();
    }
}