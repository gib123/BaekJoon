package Lv1.시저_암호;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                answer += s.charAt(i);
            } else if (Character.isUpperCase(s.charAt(i))) {
                answer += (char)((s.charAt(i) + n - 'A') % 26 + 'A');
            } else if (Character.isLowerCase(s.charAt(i))) {
                answer += (char)((s.charAt(i) + n - 'a') % 26 + 'a');
            }
        }
        return answer;
    }
}