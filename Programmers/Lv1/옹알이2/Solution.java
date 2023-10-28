package Lv1.옹알이2;

public class Solution {
	public int solution(String[] babbling) {
		int count = 0;
		String[] words = {"aya", "ye", "woo", "ma"};
		for (int i = 0; i < babbling.length; i++) {

			for (int j = 0; j < words.length; j++) {
				if (babbling[i].contains(words[j] + words[j])) break;
				babbling[i] = babbling[i].replace(words[j], " ");
			}
			babbling[i] = babbling[i].replace(" ", "");
			if (babbling[i].length() == 0) count++;
		}
		return count;
	}
}