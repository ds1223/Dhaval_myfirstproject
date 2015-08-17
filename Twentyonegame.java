package codes;

import java.util.Random;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Twentyonegame {
	 public static void main(String[] args) {
		 Scanner myscan = new Scanner(System.in);
		 char answer;
		 String Name;
		 int card1=0, card2=0, total=0;
		 System.out.print("Would you like to play blackjack? (Y/N):  ");
		 answer = myscan.findWithinHorizon(".", 0).charAt(0);
		 if (answer == 'Y' || answer == 'y'){
			 System.out.print("Okay lets start by telling me what your name is: ");
			 Scanner namef = new Scanner(System.in);
			 Name = namef.nextLine();
			 System.out.println("Good luck " + Name + ". Let's begin");
			 while (total < 19){
				 Random card = new Random();
				 int randomcard;
				 randomcard = card.nextInt(10) + 2;
				 System.out.println("Your card value is: "+ randomcard);
				 total += randomcard;
				 System.out.println("Your total is " + total);
				 
			 }
			 if (total == 21){
				 System.out.println("Wow " + Name + "! You are a winner.");
			 }else if (total == 20){
				 System.out.println("You should be a winner");
			 }else if (total == 19){
				 System.out.println("You might be a winner");
			 }else {
				System.out.println("Sorry " + Name + " you lost");
			}
		
		 }else {
			 System.out.println("Okay bye");
		 }
	}
}
