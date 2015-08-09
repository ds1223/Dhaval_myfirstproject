package codes;

import java.security.PublicKey;

public class Whileloop {

	public static void main(String[] args) {
		Wh();
		dowhile();
	}
	public static void Wh(){
		int x = 1;
		while(x<20){
			System.out.println("The number is:" + x);
			x+=5;
		}
	}
	public static void dowhile(){
		int x =2;
		do{
			System.out.println("Your number is: " + x);
			x+=3;
		}while(x<=12);
	}
}
