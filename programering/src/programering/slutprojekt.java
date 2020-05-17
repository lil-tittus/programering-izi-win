package programering;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class slutprojekt {
	static Scanner input = new Scanner(System.in);
	static String playerName = "";
	static int playerMode;
	static int playerChooseMode;
	static int playerAnswar;
	static String correctWord = "";
	static String guesses = "";
	static int playerGuesses;
	static Random rand = new Random();
	static int playerChooseDifficultie;
	static int wrongGuesses = 0;
	static int guessesLeft;
	static String displyWord = "";
	static List<String> wrongGuess = new ArrayList<String>();
	public static ArrayList<String> easy = new ArrayList<String>();
	public static ArrayList<String> medium = new ArrayList<String>();
	public static ArrayList<String> hard = new ArrayList<String>();

	public static void main(String[] args) {
		playAgain();
	}

	/**
	 * Denna metod h�lsar spelaren v�lkommen och visar att hen kan v�lja att spela
	 * ensam eller med andra
	 */
	public static void welcome() {
		System.out.println("Welcome to the H�ngagubben spelet. Please enter your name.");
		playerName = input.nextLine();
		System.out.println("Hello " + playerName
				+ ", In this game you can choose to play singel player or multieplayer, If play singel you can choose between 3 diffeculties, easy, medium and hard.");
		System.out.println(
				"If you choose multiplayer your friend can choose his own word that you are going to guess on.");

	}

	/**
	 * Denna metoden l�ter spelaren v�lja om hen vill spela ensam eller med andra
	 */
	public static void choosePlayerMode() {
		System.out.println("Modes: \n 1(singelplayer) \n 2(multiplayer)");
		System.out.println("Please enter a Mode");
		playerChooseMode = input.nextInt();
		input.nextLine();
		if (playerChooseMode == 1) {
			difficultieSingelPlayer();
		} else if (playerChooseMode == 2) {
			multiPlayer();
		}

	}

	/**
	 * Om spelaren valde singelPlayer metoden s� kommer hen hit d�r hen kan v�lja
	 * vilken sv�righetsgrad som spelaren vill spela p�
	 */
	public static void difficultieSingelPlayer() {
		System.out.println("Now you can choose between easy, medium, hard.");
		System.out.println(
				"Easy, In this difficultie you will be given a random word in the catagory easy. The word will be short and no hard spelling");
		System.out.println("Medium, In this difficultie the word will be a bit longer or having a harder spelling");
		System.out.println("Hard, This difficultie might contain a sentence or a very complicaded");
		System.out.println("You will have 8 chanses to guess the right word.");
		System.out.println("Difficultie: \n 1(Easy) \n 2(Medium) \n 3(Hard)");
		do {
			playerChooseDifficultie = input.nextInt();
			input.nextLine();
		} while (playerChooseDifficultie < 1 || playerChooseDifficultie > 3);
		singelPlayerMode();

	}

	/**
	 * I denna metoden inneh�ller welcome och choosePlayerMode eftersom att ingen
	 * annan metod kallar p� dem
	 */
	public static void theGame() {
		welcome();
		choosePlayerMode();

	}

	/**
	 * Denna metoden j�mf�r spelarens gissning till det randomiserade ordet. Om
	 * spelarens gissning �r likamed det randomiserade ordet s� skickar programmet
	 * spelaren till result metoden. Denna metoden h�ller �ven r�kning p� alla
	 * gissningar.
	 */
	public static void guesses() {

		for (int tries = 0; tries < 8; tries++) {
			System.out.println("Make a guess");
			guesses = input.nextLine();
			guesses = guesses.toUpperCase();

			word(guesses);
			System.out.println(displyWord);
			if (correctWord.equals(displyWord)) {
				result();
				break;
			} else if (!correctWord.contains(guesses)) {
				wrongGuesses++;
				wrongGuess.add(guesses.toUpperCase());
				System.out.println(Arrays.toString(wrongGuess.toArray()));
				int guessesLeft = 8 - wrongGuesses;
				System.out.println("Wrong guess, you have" + guessesLeft + "guesses left.");
				graphics();

			} else {

				System.out.println("Correct guess please continue");
				tries--;

			}
		}
		result();

	}

	/**
	 * Denna metoden �r till ifall spelaren valde mutliplayer vid
	 * "ChoosePlayerMode". Om spelaren valde multiPlayer skickas hen hit
	 */
	public static void multiPlayer() {
		System.out.println("Please enter a word that your friend is going to guess on");
		correctWord = input.nextLine();
		initdisplyWord();
		guesses();
	}

	/**
	 * I denna metoden finns det alla sv�righets grader s� att om tillexempel
	 * spelaren valde att spela p� l�tt niv� s� randomiseras ett ord fr�n den l�tta
	 * listan.
	 */
	public static void singelPlayerMode() {

		if (playerChooseDifficultie == 1) {
			correctWord = (easy.get(rand.nextInt(easy.size())));
		} else if (playerChooseDifficultie == 2) {
			correctWord = (medium.get(rand.nextInt(medium.size())));
		} else if (playerChooseDifficultie == 3) {
			correctWord = (hard.get(rand.nextInt(hard.size())));
		}
		initdisplyWord();
		guesses();
	}
	/**
	 * Denna metoden med hj�lp av word metoden byter ut ordet till "_" tills spelaren har gissat en bokstav 
	 * som ordet inneh�ller.
	 */
	private static void initdisplyWord() {
		displyWord = "";
		for (int i = 0; i < correctWord.length(); i++) {
			displyWord += "_";
		}
	}

	/**
	 * Denna metoden inneh�ller alla listor f�r singelplayer
	 */
	public static void gameList() {

		easy.add("APPLE");
		easy.add("CAR");
		easy.add("HOUSE");
		easy.add("FIRE");
		easy.add("ICE");

		medium.add("APPARTMENT");
		medium.add("POLICEDEPPARTMENT");
		medium.add("INTELLIGENCE");

		hard.add("PSYCHOPHYSICOTHERAPEUTICS");
		hard.add("EXTINGUISHERS");
		hard.add("OTORHINOLARYNGOLOGIST");

	}
	/**
	 * Se java doc f�r initdisplyWord
	 * @param guesses Det �r bokstaven spelaren gissat p�
	 */
	public static void word(String guesses) {

		char[] displyWordArray = displyWord.toCharArray();
		for (int i = 0; i < correctWord.length(); i++) {
			if (correctWord.charAt(i) == guesses.charAt(0)) {
				displyWordArray[i] = guesses.charAt(0);
			}
		}
		displyWord = new String(displyWordArray);

	}

	/**
	 * Denna metoden inneh�ller alla "m�lningar" som ska printas ut n�r spelaren
	 * gissat fel som tillslut kommer att bilda en h�ngdgubbe.
	 */
	public static void graphics() {
		if (wrongGuesses == 1) {
			System.out.println("=========");
		} else if (wrongGuesses == 2) {
			System.out.println("+---+\r\n" + "  |   |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
					+ "      |\r\n" + "=========");
		} else if (wrongGuesses == 3) {
			System.out.println("+---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "      |\r\n" + "      |\r\n"
					+ "      |\r\n" + "=========");
		} else if (wrongGuesses == 4) {
			System.out.println("+---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "  |   |\r\n" + "      |\r\n"
					+ "      |\r\n" + "=========");
		} else if (wrongGuesses == 5) {
			System.out.println("+---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|   |\r\n" + "      |\r\n"
					+ "      |\r\n" + "=========");
		} else if (playerGuesses == 6) {
			System.out.println(" +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + "      |\r\n"
					+ "      |\r\n" + "=========");
		} else if (wrongGuesses == 7) {
			System.out.println(" +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " /    |\r\n"
					+ "      |\r\n" + "=========");
		} else if (wrongGuesses == 8) {
			System.out.println(" +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " / \\  |\r\n"
					+ "      |\r\n" + "=========");
		}
	}

	/**
	 * N�r spelaren kommit fram till r�tt ord eller inte kommer hen hit d�r spelat
	 * kommer att ge hen ett val som att spela igen eller avsluta.
	 */
	public static void result() {
		System.out.println("The correct word was: " + correctWord);
		System.out.println("You guessed: " + displyWord);
		System.out.println("Now you are done, press 1 to play again and 2 to exit");
		playerAnswar = input.nextInt();
		if (playerAnswar == 1) {
			playAgain();
		} else if (playerAnswar == 2) {
			System.exit(0);
		}
	}

	/**
	 * Denna inneh�ller listan med orden och metoden d�r welcome och den metoden d�r
	 * man kunde v�lja vilket mode man ville spela i. Detta beh�vdes s� att inte
	 * spelat krashade.
	 */
	public static void playAgain() {
		gameList();
		theGame();

	}

}
