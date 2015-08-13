package codes;

import java.util.Scanner;
import java.util.Random;

public class RandomNumber {
		 public static void main(String[] args) {
			
			System.out.print("Make a wish and I'll tell you if it will come true. ");
			Scanner myscan = new Scanner(System.in);
			myscan.nextLine();
			Random randomnum = new Random();
			int randomnumber;
			randomnumber = randomnum.nextInt(10)+1; //Add 1 to produce #s from 1-10 instead of 0-9
			if (randomnumber>5) {
				System.out.println("Your wish will come true");
			}else if (randomnumber == 2){
				System.out.println("Hmmm, Sorry to hard to determine");
			}else if (randomnumber == 9){
				System.out.println("Of course your wish will come true");
			}else {
				System.out.println("Your wish will not come true, Sorry!");
			}
				
			
		}
}
