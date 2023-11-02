package Lv1.둘만의_암호;

import java.util.*;

public class Solution {
	public String solution(String s, String skip, int index) {
		HashMap<Character, Boolean> map = new HashMap<>();
		for (int i = 0; i < skip.length(); i++) {
			map.put(skip.charAt(i), true);
		}
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			for (int j = 0; j < index; j++) {
				ch = (ch == 'z') ? 'a' : (char)(ch + 1);
				if (map.get(ch) != null) j--;
			}
			answer += ch;
		}
		return answer;
	}
}