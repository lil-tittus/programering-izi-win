package programering;

import java.util.Scanner;
import java.util.Random;
public class Tal {
	static int Choosedifficulty;
	static int Playerguess;
	static int Rightanswar;
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Shalom my comrade, welcome to my epic game!");
		Choosedifficulty();
		Choosedifficultyeasy();
		
	}
	
	
	
	public static void Choosedifficulty () {
		Scanner input = new Scanner (System.in);
		System.out.println("Difficultys :  \b 1(easy) \b 2(medium) \b 3(hard)");
		while (true){
			System.out.println("Choose a difficulty from 1-3");
			int Choosedifficulty = input.nextInt();
			if (Choosedifficulty  == 1 || Choosedifficulty  == 2 || Choosedifficulty  == 3) {
				break;
			
	}

	
		}
	
	}
	
	public static void Choosedifficultyeasy() {
		if(Choosedifficulty == 1) {
		if(Playerguess < Rightanswar) {
			System.out.println("Number is higher");
		}
		else if(Playerguess > Rightanswar) {
			System.out.println("Number is lower");
		}
		else if(Playerguess == Rightanswar){
			System.out.println("You got it my comrade!!");
			
		}
		}
	}
	
		}
	
