package Challenges;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int anagram(String s) {
		if (s.length() % 2 != 0)
			return -1;
		int ret = 0;
		int[] cArr = new int[26];
		for (int i = 0; i < s.length() / 2; i++)
			cArr[s.charAt(i) - 97]++;
		for (int i = s.length() / 2; i < s.length(); i++)
			cArr[s.charAt(i) - 97]--;
		for (int val : cArr) {
			ret += Math.abs(val);
		}
		return ret / 2;

	}

}
