package Challenges;

public class Kangaroo {

	public static void main(String[] args) {
		// Test Case
		String case1 = kangaroo(0, 3, 4, 2);
		System.out.println(case1);
		String case2 = kangaroo(0, 2, 5, 3);
		System.out.println(case2);

	}
	
	static String kangaroo(int x1, int v1, int x2, int v2) {
        String result = "";
        if (x1 < x2 && v1 < v2)
            result = "NO";
        else {
            if (v1 != v2 && (x2 - x1) % (v1 - v2) == 0)
                result = "YES";
            else
                result = "NO";

        }

        return result;


    }

}
