package Challenges;

import java.util.List;

public class BonAppetit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static void bonAppetit(List<Integer> bill, int k, int b) {
		int c = 0;
    	for (int i = 0; i < bill.size(); i++) {
			if(i!=k) {
				c=c+bill.get(i);
			}
		}
    	int s = c/2;
    	if(b-s <= 0) {
    		System.out.println("Bon Appetit");
    	}else {
    		System.out.println(b-s);
    	}


    }

}
