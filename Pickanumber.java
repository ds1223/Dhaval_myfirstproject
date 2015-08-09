package codes;

import java.util.Scanner;

public class Pickanumber {
	
	public static void main(String[] args) {
		
		System.out.println("Pick a number between 1-10: ");
		pick();
		
	}
	public static void pick() {
		Scanner in= new Scanner(System.in);
		int x= in.nextInt();
		if(x==4){
			System.out.println("You pick the right number");
		}else if (x!=4 && x>10){
			System.out.println("You are out of range of selection");
			int y=in.nextInt();
		}else {
			System.out.println("Not correct");
		}
		
	}
}
