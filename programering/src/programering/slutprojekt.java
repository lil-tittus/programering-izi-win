package programering;

import java.util.Scanner;

public class slutprojekt {
	static Scanner input = new Scanner(System.in);
	static String playerName;
	static int playerMode;
	
	public static void main(String[] args) {
		
	}
	
	public static void welcome() {
		System.out.println("Welcome to the Hängagubben spelet. Please enter your name.");
		playerName = input.nextLine();
		System.out.println("Hello" + playerName + ", In this game you can choose to play singel player or multieplayer, If play singel you can choose between 3 diffeculties, easy, medium and hard.");
		System.out.println("If you choose multieplayer your friend can choose his own word that you are going to guess on.");
		
	}
	public static void choosePlayerMode() {
		System.out.println("Modes: \n 1(singelplayer) \n 2(multiplayer)");
		System.out.println("Please enter a Mode");
		while (playerMode < 1 || playerMode > 2) {
			
		}
		switch (playerMode) {
		case 1:
			difficultieSingelPlayer();
		case 2:
			multiPlayer();

		}
	}
	public static void difficultieSingelPlayer() {
		System.out.println("Now you can choose between easy, medium, hard.");
		System.out.println("Easy, In this difficultie you will be given a random word in the catagory easy. The word will be short and no hard spelling");
		System.out.println("");
	}
}
