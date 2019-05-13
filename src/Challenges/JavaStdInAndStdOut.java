package Challenges;

import java.util.Scanner;

public class JavaStdInAndStdOut {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
		
        input.close();
	}
		

}

