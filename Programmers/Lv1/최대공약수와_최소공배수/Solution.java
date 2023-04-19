package Lv1.최대공약수와_최소공배수;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {0, 0};
        for (int i = Math.max(n, m); i > 0; i--) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                answer[1] = n * m / i;
                break;
            }
        }
        return answer;
    }
}