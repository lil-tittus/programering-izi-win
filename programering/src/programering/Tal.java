package programering;

import java.util.Scanner;
import java.util.Random;
public class Tal {
	static Random rand = new Random();
	static int Choosedifficulty;
	static int Playerguess;
	static int Rightanswareasy;
	static int Rightanswarmedium;
	static int Rightanswarhard;
	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Shalom my comrade, welcome to my epic game!");
		Choosedifficulty();
		Choosedifficultyeasy();
		
	}
	
	
	
	public static void Choosedifficulty () {
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
		if(Playerguess < Rightanswareasy) {
			System.out.println("Number is higher");
		}
		else if(Playerguess > Rightanswareasy) {
			System.out.println("Number is lower");
		}
		else if(Playerguess == Rightanswareasy){
			System.out.println("You got it my comrade!!");
			
		}
		}
	}
	
	public static void Random() {
		if(Choosedifficulty == 1) {
			Rightanswareasy = rand.nextInt(50)+1;
		}
		else if(Choosedifficulty == 2) {
			Rightanswarmedium = rand.nextInt(100)+1;
		}
		else if(Choosedifficulty == 3) {
			Rightanswarhard = rand.nextInt(100)+1;
		}
	}
		}
	
