package Challenges;

import java.util.HashSet;

public class TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static String twoStrings(String s1, String s2) {
        HashSet<Character> map = new HashSet<Character>();
        char[] str = s1.toCharArray();
    for(int i=0; i<s1.length();i++){
        map.add(str[i]);
    }
    for(char element: s2.toCharArray()){
        if(map.contains(element)){
            return "YES";
        }
    }
    return "NO";


    }


}
