package Lv1.이상한_문자_만들기;

class Solution {
    public String solution(String s) {
        String answer = "";
        for (int i = 0, j = 0; i < s.length(); i++, j++) {
            if (s.charAt(i) == ' ') {
                j = -1;
            }
            answer += (j % 2 == 0) ? Character.toUpperCase(s.charAt(i)) : Character.toLowerCase(s.charAt(i));
        }
        return answer;
    }
}