package com.digiteck.inheritencydemo;

public class StandardComputer {
	String computer;
	String megabytes;
	int storage = 128;
	String gigabytes;

	

	public void build() {
		System.out.println("We will begin building your computer");
	}
	
	
	
	public StandardComputer(int memory, String name){
		System.out.println("Hello, I see you would like to purchase " + name);
		System.out.println("Also, you want to have " + memory + " amounts of memory");
	}


}

