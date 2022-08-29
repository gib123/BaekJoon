import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int wordLen = br.readLine().length();
        System.out.println(wordLen);
        br.close();
    }
}