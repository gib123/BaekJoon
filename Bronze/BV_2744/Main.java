import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (('A' <= word.charAt(i)) && (word.charAt(i) <= 'Z')) {
                sb.append((char)(word.charAt(i) + 32));
            } else if (('a' <= word.charAt(i)) && (word.charAt(i) <= 'z')){
                sb.append((char)(word.charAt(i) - 32));
            }
        }
        System.out.println(sb);
        br.close();
    }
}