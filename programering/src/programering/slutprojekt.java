package programering;

import java.util.Scanner;
import java.util.ArrayList;
public class slutprojekt {
	static Scanner input = new Scanner(System.in);
	static String playerName;
	static int playerMode;
	static int playerChoose;
	static String playerAnswar;
	static String correctWord;
	static int guesses;
	
	
	public static void main(String[] args) {
		
	}
	
	public static void welcome() {
		System.out.println("Welcome to the Hängagubben spelet. Please enter your name.");
		playerName = input.nextLine();
		System.out.println("Hello" + playerName + ", In this game you can choose to play singel player or multieplayer, If play singel you can choose between 3 diffeculties, easy, medium and hard.");
		System.out.println("If you choose multiplayer your friend can choose his own word that you are going to guess on.");
		
	}
	public static void choosePlayerMode() {
		System.out.println("Modes: \n 1(singelplayer) \n 2(multiplayer)");
		System.out.println("Please enter a Mode");
		if(playerChoose == 1) {
			difficultieSingelPlayer();
		}
		else if(playerChoose == 2) {
			multiPlayer();
		}
	}
	public static void difficultieSingelPlayer() {
		System.out.println("Now you can choose between easy, medium, hard.");
		System.out.println("Easy, In this difficultie you will be given a random word in the catagory easy. The word will be short and no hard spelling");
		System.out.println("Medium, In this difficultie the word will be a bit longer or having a harder spelling");
		System.out.println("Hard, This difficultie might contain a sentence or a very complicaded");
		System.out.println("You will have 10 chanses to guess the right word.");
		System.out.println("Difficultie: \n 1(Easy) \n 2(Medium) \n 3(Hard)");
		theGame();
				
		}
		
	public static void theGame() {
		while (playerAnswar != correctWord) {
			if(guesses == 10) {
				break;
			}
		}

		}
	public static void gameList() {
		ArrayList<String> easy = new ArrayList<String>();
			easy.add("apple");
			easy.add("car");
			easy.add("house");
			easy.add("fire");
			easy.add("ice");
	}
		
	}
	

