package Challenges;

public class SimpleArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int simpleArraySum(int[] ar) {
        int result = 0;
        for (int i = 0; i < ar.length; i++){
            result = result + ar[i];
        }

        return result;
    }

}
