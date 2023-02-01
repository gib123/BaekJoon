package bronze.ii.no1919;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        for (char c : br.readLine().toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : br.readLine().toCharArray()) {
            arr[c - 'a']--;
        }
        br.close();
        int count = 0;
        for (int i = 0; i < 26; i++) {
            count += (arr[i] < 0) ? -arr[i] : arr[i];
        }
        System.out.println(count);
    }
}