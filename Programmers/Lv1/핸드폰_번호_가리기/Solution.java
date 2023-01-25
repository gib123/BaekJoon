package Lv1.핸드폰_번호_가리기;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for (int i = 0; i < phone_number.length(); i++) {
            answer += (i < phone_number.length() - 4) ? "*" : phone_number.charAt(i);
        }
        return answer;
    }
}