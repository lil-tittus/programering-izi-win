package programering;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class slutprojekt {
	static Scanner input = new Scanner(System.in);
	static String playerName;
	static int playerMode;
	static int playerChooseMode;
	static String playerAnswar;
	static String correctWord;
	static String guesses;
	static int playerGuesses;
	static Random rand = new Random();
	static int playerChooseDifficultie;
	static String randomWord;
	static int wrongGuesses;
	public static ArrayList<String> easy = new ArrayList<String>();
	public static ArrayList<String> medium = new ArrayList<String>();
	public static ArrayList<String> hard = new ArrayList<String>();
	
	
	
	public static void main(String[] args) {
		difficultieSingelPlayer();
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
		if(playerChooseMode == 1) {
			difficultieSingelPlayer();
		}
		
		}
	
	public static void difficultieSingelPlayer() {
		System.out.println("Now you can choose between easy, medium, hard.");
		System.out.println("Easy, In this difficultie you will be given a random word in the catagory easy. The word will be short and no hard spelling");
		System.out.println("Medium, In this difficultie the word will be a bit longer or having a harder spelling");
		System.out.println("Hard, This difficultie might contain a sentence or a very complicaded");
		System.out.println("You will have 8 chanses to guess the right word.");
		System.out.println("Difficultie: \n 1(Easy) \n 2(Medium) \n 3(Hard)");
		do  {
			playerChooseDifficultie = input.nextInt();
		}while (playerChooseDifficultie < 1 || playerChooseDifficultie > 3);
		switch (playerChooseDifficultie) {
		case 1:
			singelPlayerMode();
		case 2:
			singelPlayerMode();
		case 3:
			singelPlayerMode();

		}
		theGame();
				
		}
		
	public static void theGame() {
		System.out.println(correctWord);
		while (playerAnswar != correctWord) {
			if(playerGuesses == 8) {
				break;
			}
		}

		}
	
	public static void singelPlayerMode() {
		gameList();
		if(playerChooseDifficultie == 1) {
			correctWord = (easy.get(rand.nextInt(easy.size())));
		}
		else if(playerChooseDifficultie == 2) {
			correctWord = (medium.get(rand.nextInt(medium.size())));
		}
		else if(playerChooseDifficultie == 3) {
			correctWord = (hard.get(rand.nextInt(hard.size())));
		}
	}
	public static void gameList() {
		
			easy.add("apple");
			easy.add("car");
			easy.add("house");
			easy.add("fire");
			easy.add("ice");
		for (int i = 0; i < 1; i++) {
            correctWord = (easy.get(rand.nextInt(easy.size())));
		}
		
			medium.add("appartment");
			medium.add("policedepartment");
			medium.add("extinguishers");
		for(int i = 0; i < 1; i++) {
            correctWord = (medium.get(rand.nextInt(medium.size())));
	}
		
			hard.add("i like programing");
			hard.add("school is very hard");
			hard.add("i want to comit suicide");
		for(int i = 0; i < 1; i++) {
	            correctWord = (hard.get(rand.nextInt(hard.size())));
			
		}
		
	}
	public static String Word(String guesses) {
		String newRandomWord = "";
		for (int i = 0; i < correctWord.length(); i++) {
			char correctWordChar = Character.toUpperCase(correctWord.charAt(i));
			char guessesChar = Character.toUpperCase(guesses.charAt(0));
			if (correctWordChar == guessesChar) {
				newRandomWord += guessesChar;
			} else if (randomWord.charAt(i) != "_".charAt(0)) {
				newRandomWord += randomWord.charAt(i);
			} else {
				newRandomWord += "_";
			}
		}
		return newRandomWord;
	}
	
	public static void graphics() {
		if(wrongGuesses == 1) {
			System.out.println("=========");
		}
		else if(wrongGuesses == 2) {
			System.out.println("+---+\r\n" + 
					"  |   |\r\n" + 
					"      |\r\n" + 
					"      |\r\n" + 
					"      |\r\n" + 
					"      |\r\n" + 
					"=========");
		}
		else if(wrongGuesses == 3) {
			System.out.println("+---+\r\n" + 
					"  |   |\r\n" + 
					"  O   |\r\n" + 
					"      |\r\n" + 
					"      |\r\n" + 
					"      |\r\n" + 
					"=========");
		}
		else if (wrongGuesses == 4) {
			System.out.println("+---+\r\n" + 
					"  |   |\r\n" + 
					"  O   |\r\n" + 
					"  |   |\r\n" + 
					"      |\r\n" + 
					"      |\r\n" + 
					"=========");
		}
		else if (wrongGuesses == 5) {
			System.out.println("+---+\r\n" + 
					"  |   |\r\n" + 
					"  O   |\r\n" + 
					" /|   |\r\n" + 
					"      |\r\n" + 
					"      |\r\n" + 
					"=========");
		}
		else if (playerGuesses == 6) {
			System.out.println(" +---+\r\n" + 
					"  |   |\r\n" + 
					"  O   |\r\n" + 
					" /|\\  |\r\n" + 
					"      |\r\n" + 
					"      |\r\n" + 
					"=========");
		}
		else if (wrongGuesses == 7) {
			System.out.println(" +---+\r\n" + 
					"  |   |\r\n" + 
					"  O   |\r\n" + 
					" /|\\  |\r\n" + 
					" /    |\r\n" + 
					"      |\r\n" + 
					"=========");
		}
		else if (wrongGuesses == 8) {
			System.out.println(" +---+\r\n" + 
					"  |   |\r\n" + 
					"  O   |\r\n" + 
					" /|\\  |\r\n" + 
					" / \\  |\r\n" + 
					"      |\r\n" + 
					"=========");
		}
	}

	}
	

