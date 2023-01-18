package Lv1.하샤드_수;

class Solution {
    public boolean solution(int x) {
        int sum = Integer.toString(x).chars().map(c -> c - '0').sum();
        return (x % sum == 0) ? true : false;
    }
}