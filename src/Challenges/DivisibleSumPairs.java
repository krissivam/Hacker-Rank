package Challenges;

public class DivisibleSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int divisibleSumPairs(int n, int k, int[] ar) {
        int result = 0;
        for (int i = 0; i < ar.length; i++) {            
            for (int j = i+1; j < ar.length; j++) {
                if((ar[i]+ar[j])%k == 0)
                    result++;
            }
        }
        return result;


    }

}
