package programering;

import java.util.Scanner;
import java.util.Random;

public class Tal {
	static Random rand = new Random();
	static int Choosedifficulty;
	static int Playerguess;
	static Scanner input = new Scanner(System.in);
	static int guesses;
	static int Noiceanswar;
	static boolean isdifficultymedium = false;
	static boolean isdifficultyhard = false;
	static int Playerchoose;

	public static void main(String[] args) {
		Playagain();

	}
	/**
	 * This method shows the player what difficulty's the player can choose between:
	 */
	public static void Choosedifficulty() {
		System.out.println("Difficultys :  \n 1(easy) \n 2(medium) \n 3(hard)");
		System.out.println("Please enter a difficulty");
		while (Choosedifficulty < 1 || Choosedifficulty > 3) {
			Choosedifficulty = Exception();
		}
		switch (Choosedifficulty) {
		case 1:
			Choosedifficultyeasy();
		case 2:
			Choosedifficultymedium();
		case 3:
			Choosedifficultyhard();

		}

	}
	/**
	 * This method is for if the the player presses a letter instead of a number. 
	 * @returnIt returns that the input is wrong and asks the player to put in a number instead.
	 */
	public static int Exception() {
		int WrongFromUser;
		while (true) {

			try {
				WrongFromUser = input.nextInt();
				break;

			} catch (Exception e) {
				System.out.println("Wrong input! Please enter a number!");
				input.next();
			}
		}
		return WrongFromUser;
	}
	/**
	 * This method is for if the player chooses to play the easy level.
	 */
	public static void Choosedifficultyeasy() {
		Random();
		while (Playerguess != Noiceanswar) {
			guesses++;
			System.out.println("Please enter a number");

			Playerguess = Exception();
			Hint();
		}
		Result();
	}
	/**
	 * This method is for if the player chooses to play the medium level.
	 */
	public static void Choosedifficultymedium() {
		isdifficultymedium = true;
		Random();
		while (Playerguess != Noiceanswar) {
			guesses++;
			if (guesses == 20) {
				break;
			}
			System.out.println("Please enter a number");

			Playerguess = Exception();
			Hint();

		}
		Result();
	}
	/**
	 * This method is for when the player presses the number "3" and chooses to play level hard.
	 */
	public static void Choosedifficultyhard() {
		isdifficultyhard = true;
		Random();
		while (Playerguess != Noiceanswar) {
			guesses++;
			if (guesses == 20) {
				break;
			}
			System.out.println("Please enter a number");

			Playerguess = Exception();
			Hint();

		}
		Result();
	}
	/**
	 * This method randomizes a new number for every difficulty and every time the player chooses to play again.
	 */
	public static void Random() {
		if (Choosedifficulty == 1) {
			Noiceanswar = rand.nextInt(50) + 1;
		} else if (Choosedifficulty == 2) {
			Noiceanswar = rand.nextInt(100) + 1;
		} else if (Choosedifficulty == 3) {
			Noiceanswar = rand.nextInt(100) + 1;
		}
	}

	public static void Result() {
		if (Playerguess == Noiceanswar) {
			System.out.println("You got it my comrade!!");
		} else if (Playerguess != Noiceanswar) {
			System.out.println("You stupid, GAME OVER");
		}
		System.out.println("Press 1 if you want to play again else press 2 to exit if you are a pussy");
		Playerchoose = Exception();
		if (Playerchoose == 1) {
			Playagain();
		} else if (Playerchoose == 2) {
			System.exit(0);
		}
	}

	public static void Hint() {
		if (isdifficultymedium && guesses > 10) {
			System.out.println("You have no hints left! noob");
		}

		else if (isdifficultyhard && guesses > 1) {
			System.out.println("You have no hints left! noob");
		} else if (Playerguess < Noiceanswar) {
			System.out.println("Number is higher");
			System.out.println("You have guessed:" + guesses + "times");
		} else if (Playerguess > Noiceanswar) {
			System.out.println("Number is lower");
			System.out.println("You have guessed:" + guesses + "times");
		}

	}

	public static void Playagain() {
		Choosedifficulty = 0;
		Playerguess = 0;
		guesses = 0;
		Noiceanswar = 0;
		Playerchoose = 0;
		System.out.println("Shalom my comrade, welcome to my epic game!");
		Choosedifficulty();
	}

}
