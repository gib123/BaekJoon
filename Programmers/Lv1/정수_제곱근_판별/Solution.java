package Lv1.정수_제곱근_판별;

class Solution {
    public long solution(long n) {
        if ((long)Math.pow((int)Math.sqrt(n), 2) == n) return (long)Math.pow((int)Math.sqrt(n) + 1, 2);
        return -1;
    }
}