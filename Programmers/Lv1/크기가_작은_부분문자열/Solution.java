package Lv1.크기가_작은_부분문자열;

public class Solution {
    public int solution(String t, String p) {
        int pLen = p.length();
        int tLen = t.length();
        long pNum = Long.valueOf(p);
        int count = 0;
        for (int i = 0; i < tLen - pLen + 1; i++) {
            long tNum = 0;
            for (int j = 0; j < pLen; j++) {
                tNum = (tNum * 10 + (t.charAt(i + j) - '0'));
            }
            if (tNum <= pNum) count++;
        }
        return count;
    }
}