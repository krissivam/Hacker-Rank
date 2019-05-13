package Challenges;

import java.util.Scanner;

public class MarsExploration {

	public static void main(String[] args) {
		/*
		// BISA
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int l = s.length();
		String tmp = "SOS";
		int n = l / 3;
		String newString = tmp;
		for (int i = 1; i < n; i++) {
			newString += tmp;
		}
		int count = 0;
		for (int i = 0; i < l; i++) {
			if (newString.charAt(i) != s.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
		*/
		Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int result = marsExploration(s);
        System.out.println(result);
        scanner.close();
        
        

	}
	
	
	static int marsExploration(String s) {
        int cnt = 0;
        for(int i =0;i<s.length(); i+=3){
 
            if(s.charAt(i)!='S'){
                cnt = cnt + 1;
 
            }
 
            if(s.charAt(i+1)!='O'){
                cnt = cnt + 1;
 
            }
 
            if(s.charAt(i+2)!='S'){
                cnt = cnt + 1;
 
            }
            
        }
        return cnt;
        
        


    }
    

}
