package codes;

public class Arrayifstatement {
	
	public static void main(String[] args) {

		int arg[]= {2,5,7,9};
		int result = arg[0] + arg[2];
		System.out.println("There are " + result + " in your party");
		if (result ==7){
			System.out.println("You are at maximum capacity");
		}else if (result < 7){
			System.out.println("You can add more people");
		}else {
			System.out.println("Sorry can't enter too many people in your party");
		}

	}
}
