package Challenges;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int camelcase(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        return count +1;


    }

}
