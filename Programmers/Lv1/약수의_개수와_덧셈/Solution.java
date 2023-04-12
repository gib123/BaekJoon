package Lv1.약수의_개수와_덧셈;

class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        for (int i = left; i < right + 1; i++) {
            int j = 1;
            for (; j * j < i; j++);
            sum += (j * j == i) ? -i : i;
        }
        return sum;
    }
}