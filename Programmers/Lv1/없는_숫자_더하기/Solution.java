package Lv1.없는_숫자_더하기;

class Solution {
    public int solution(int[] numbers) {
        int sum = 9 * 10 / 2;
        for (int e : numbers) {
            sum -= e;
        }
        return sum;
    }
}