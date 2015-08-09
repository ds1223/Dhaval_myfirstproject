package codes;

import java.security.PublicKey;
import java.util.Scanner;

public class Userinputnumber {
	
	public static void main(String[] args) {
		System.out.println("Please enter your grade: ");
		input();
		
	}public static void input() {
		Scanner in = new Scanner(System.in);
		
		int x= in.nextInt(); //Int the i has to be capitalized
		if (x>90){
			System.out.println("You received an A");
		}else if (x>=80){
			System.out.println("You received an B");
			
		}else if (x>70){
			System.out.println("You received an C");
		}else {
			System.out.println("See me after class");
		}
	}
}
