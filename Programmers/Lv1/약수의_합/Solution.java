package Lv1.약수의_합;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            answer += (n % i == 0) ? ((n / i == i) ? i : n / i + i) : 0;
        }
        return answer;
    }
}
