package Challenges;

public class ApplesAndOranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countApplesAndOranges(5, 11, 5, 15, new int[] {-2,2,1}, new int [] {5,-6});
		countApplesAndOranges(2, 3, 1, 5,new int[] {-2}, new int[] {-1});

	}
	
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int cApple=0;
        for(int x=0; x<apples.length; x++){
            int jarak = a+apples[x];
            // jika jarak antara s dan t
            if(jarak >=s && jarak <= t){
                cApple++;
            }
        }
        int cOrange = 0;
        for(int y=0; y < oranges.length; y++){
            int jarak = b+oranges[y];
            if(jarak >= s && jarak <= t ){
                cOrange++;
            }
        }
        System.out.println(cApple);
        System.out.println(cOrange);
        

    }
}
