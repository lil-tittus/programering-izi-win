package programering;

import java.util.Scanner;

public class slutprojekt {
	static Scanner input = new Scanner(System.in);
	static String playerName;
	
	public static void main(String[] args) {
		
	}
	
	public static void welcome() {
		System.out.println("Welcome to the Hängagubben spelet. Please enter your name.");
		playerName = input.nextLine();
	}
}
