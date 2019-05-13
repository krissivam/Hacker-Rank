package Challenges;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int birthdayCakeCandles(int[] ar) {
        int hasil = 1;
        int max = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] == max) {
                hasil++;
            }
            if (ar[i] > max) {
                max = ar[i];
                hasil = 1;
            }
        }
        return hasil;
    }

}
