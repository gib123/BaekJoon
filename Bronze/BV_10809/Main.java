import java.io.*;

public class Main {
    public static final int alphabetNum = 26;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int[] location = new int[alphabetNum];
        for (int i = 0; i < alphabetNum; i++) {
            location[i] = -1;
        }
        int len = word.length();
        int idx = 0;
        for (int i = 0; i < len; i++) {
            idx = word.charAt(i) - 'a';
            if (location[idx] == -1) {
                location[idx] = i;
            }
        }

        for (int i = 0; i < alphabetNum; i++) {
            System.out.print(location[i] + " ");
        }
        System.out.println();
        br.close();
    }
}