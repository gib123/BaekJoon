package Lv1.두_정수_사이의_합;

class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        for (int i = (a < b) ? a : b; i <= ((a > b) ? a : b); i++) {
            sum += i;
        }
        return sum;
    }
}