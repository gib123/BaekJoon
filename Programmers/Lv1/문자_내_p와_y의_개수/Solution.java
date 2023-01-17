package Lv1.문자_내_p와_y의_개수;

class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += (s.charAt(i) == 'p') ? 1 : ((s.charAt(i) == 'y') ? -1 : 0);
        }

        boolean answer = (count == 0) ? true : false;
        return answer;
    }
}