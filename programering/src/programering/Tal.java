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
	static int guesses;
	
	public static void main(String[] args) {
		System.out.println("Shalom my comrade, welcome to my epic game!");
		Choosedifficulty();
		Choosedifficultyeasy();
		
	}
	
	
	
	public static void Choosedifficulty () {
		System.out.println("Difficultys :  \b 1(easy) \b 2(medium) \b 3(hard)");
		System.out.println("Please enter a difficulty");
		while (Choosedifficulty < 1 || Choosedifficulty > 4) {
            Choosedifficulty = input.nextInt();
          }
          switch (Choosedifficulty) {
            case 1: Choosedifficultyeasy();
            case 2: Choosedifficultymeadium();
            case 3: Choosedifficultyhard();
            
          }
			
	}

		
		
		
		
		
		
	
	
	
	
	 public static int Exception () {
		 String WrongFromUser = "";
		 while (true) {
			 WrongFromUser = input.nextLine();
			 try {
				 return Integer.parseInt(WrongFromUser);
				 
			 } catch (Exception e) {
				 System.out.println("Wrong input! Please enter a number!");
				 input.hasNext();
			 }
		 }
	 }
	public static void Choosedifficultyeasy() {
		if(Choosedifficulty == 1) {
		int Rightanswareasy = rand.nextInt(50)+1;
		while(Playerguess != Rightanswareasy) {
			System.out.println("Please enter a number");
		
		int Playerguess = input.nextInt();
		if(Playerguess < Rightanswareasy) {
			System.out.println("Number is higher");
		}
		else if(Playerguess > Rightanswareasy) {
			System.out.println("Number is lower");
		}
		else if(Playerguess == Rightanswareasy){
			System.out.println("You got it my comrade!!");
			break;
		}
		}
		
		}
	}
	
	public static void Choosedifficultymeadium() {
		if(Choosedifficulty == 2) {
			int Rightanswarmedium = rand.nextInt(100)+1;
			while(Playerguess != Rightanswarmedium) {
				guesses++;
				if(guesses == 20) break;
				System.out.println("Please enter a number");
			
			int Playerguess = input.nextInt();
			if(Playerguess < Rightanswarmedium) {
				System.out.println("Number is higher");
				System.out.println("You have guessed:" + guesses + "times");
			}
			else if(Playerguess > Rightanswarmedium) {
				System.out.println("Number is lower");
				System.out.println("You have guessed:" + guesses + "times");
			}
			else if(Playerguess == Rightanswarmedium){
				System.out.println("You got it my comrade!!");
				break;
			}
		}
		}
	}
	
	public static void Choosedifficultyhard() {
		if(Choosedifficulty == 3) {
			int Rightanswarhard = rand.nextInt(100)+1;
			while(Playerguess != Rightanswarhard) {
				guesses++;
				if(guesses == 10) break;
				System.out.println("Please enter a number");
			
			int Playerguess = input.nextInt();
			if(Playerguess < Rightanswarhard) {
				System.out.println("Number is higher");
				System.out.println("You have guessed:" + guesses + "times");
			}
			else if(Playerguess > Rightanswarhard) {
				System.out.println("Number is lower");
				System.out.println("You have guessed:" + guesses + "times");
			}
			else if(Playerguess == Rightanswarhard){
				System.out.println("You got it my comrade!!");
				break;
				
			}
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
	
