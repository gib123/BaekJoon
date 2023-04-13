package Lv1.부족한_금액_계산하기;

class Solution {
    public long solution(int price, int money, int count) {
        Long priceSum = 0L;
        for (int i = 0; i < count; i++) {
            priceSum += price * (i + 1);
        }
        return (priceSum > money) ? (priceSum - money) : 0;
    }
}