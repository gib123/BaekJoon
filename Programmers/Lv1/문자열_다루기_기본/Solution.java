package Lv1.문자열_다루기_기본;

class Solution {
    public boolean solution(String s) {
        return (s.matches("\\d{4}") || s.matches("\\d{6}")) ? true : false;
    }
}