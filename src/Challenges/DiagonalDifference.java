package Challenges;

public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int diagonalDifference(int[][] arr) {
        int hasil = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    a = a + arr[i][j];
                }
                if (i + j == arr.length - 1) {
                    b = b + arr[i][j];
                }
            }
 
        }
        if (a > b) {
            hasil = a - b;
 
        } else {
            hasil = b - a;
        }
        return hasil;
    }

}
