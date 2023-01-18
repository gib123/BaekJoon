package Lv1.콜라츠_추측;

class Solution {
    public int solution(int num) {
        long n = num;
        if (n == 1) return 0;
        for (int i = 0; i < 500; i++) {
            if (n == 1) return i;
            n = (n % 2 == 0) ? n / 2 : n *  3 + 1;
        }
        return -1;
    }
}