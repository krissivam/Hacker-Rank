package Challenges;

public class AVeryBigSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static long aVeryBigSum(long[] ar) {
        int len = ar.length;
        long hasil = 0;
        for (int i = 0; i < len; i++) {
            hasil += ar[i];
        }
        return hasil;

    }

}
