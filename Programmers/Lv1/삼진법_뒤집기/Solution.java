package Lv1.삼진법_뒤집기;

class Solution {
    public int solution(int n) {
        String string = "";
        while (n >= 1) {
            string += (n % 3);
            n /= 3;
        }
        return Integer.parseInt(string, 3);
    }
}