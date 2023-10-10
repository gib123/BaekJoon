package Lv1.숫자_문자열과_영단어;

public class Solution {
    public int solution(String s) {
        int result = 0;
        String[] n = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                result = result * 10 + (ch - '0');
            } else {
                for (int j = 0; j < n.length; j++) {
                    if (s.startsWith(n[j], i)) {
                        result = result * 10 + j;
                        i += (n[j].length() - 1);
                        break;
                    }
                }
            }
        }
        return result;
    }
}