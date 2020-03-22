package programering;

import java.util.Scanner;
import java.util.Random;
public class Tal {
	static Random rand = new Random();
	static int Choosedifficulty;
	static int Playerguess;
	static Scanner input = new Scanner (System.in);
	static int guesses;
	static int Noiceanswar;
	static boolean isdifficultymedium = false;
	static boolean isdifficultyhard = false;
	static int Playerchoose;
	public static void main(String[] args) {
		Playagain();
		
	}
	
	
	
	public static void Choosedifficulty () {
		System.out.println("Difficultys :  \b 1(easy) \b 2(medium) \b 3(hard)");
		System.out.println("Please enter a difficulty");
		while (Choosedifficulty < 1 || Choosedifficulty > 3) {
            Choosedifficulty = input.nextInt();
          }
          switch (Choosedifficulty) {
            case 1: Choosedifficultyeasy();
            case 2: Choosedifficultymedium();
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
		int Noiceanswar = rand.nextInt(50)+1;
		while(Playerguess != Noiceanswar) {
			System.out.println("Please enter a number");
		
		int Playerguess = input.nextInt();
		Hint();
		
		 if(Playerguess < Noiceanswar) {
			System.out.println("Number is higher");
			System.out.println("You have guessed:" + guesses + "times");
		}
		else if(Playerguess > Noiceanswar) {
			System.out.println("Number is lower");
			System.out.println("You have guessed:" + guesses + "times");
		}
		else if(Playerguess == Noiceanswar){
			System.out.println("You got it my comrade!!");
			break;
		}
		}
		
		}
	}
	
	public static void Choosedifficultymedium() {
		isdifficultymedium = true;
		if(Choosedifficulty == 2) {
			int Noiceanswar = rand.nextInt(100)+1;
			while(Playerguess != Noiceanswar) {
				guesses++;
				if(guesses == 20) { break;}
				System.out.println("Please enter a number");
			
			int Playerguess = input.nextInt();
			Hint();
			
			if(isdifficultymedium && guesses > 10) {
				System.out.println("You have no hints left! noob"); 
				break;
			}
			else if(Playerguess < Noiceanswar) {
				System.out.println("Number is higher");
				System.out.println("You have guessed:" + guesses + "times");
			}
			else if(Playerguess > Noiceanswar) {
				System.out.println("Number is lower");
				System.out.println("You have guessed:" + guesses + "times");
			}
			else if(Playerguess == Noiceanswar){
				System.out.println("You got it my comrade!!");
				break;
			}
		}
		}
	}
	
	public static void Choosedifficultyhard() {
		isdifficultyhard = true;
		if(Choosedifficulty == 3) {
			int Noiceanswar = rand.nextInt(100)+1;
			while(Playerguess != Noiceanswar) {
				guesses++;
				if(guesses == 10) { break;}
				System.out.println("Please enter a number");
			
			int Playerguess = input.nextInt(); 
			Hint();
			
			else if(Playerguess < Noiceanswar) {
				System.out.println("Number is higher");
				System.out.println("You have guessed:" + guesses + "times");
			}
			else if(Playerguess > Noiceanswar) {
				System.out.println("Number is lower");
				System.out.println("You have guessed:" + guesses + "times");
			}
			else if(Playerguess == Noiceanswar){
				System.out.println("You got it my comrade!!");
				break;
				
			}
			}
		}
		
	}
	
	public static void Random() {
		if(Choosedifficulty == 1) {
			Noiceanswar = rand.nextInt(50)+1;
		}
		else if(Choosedifficulty == 2) {
			Noiceanswar = rand.nextInt(100)+1;
		}
		else if(Choosedifficulty == 3) {
			Noiceanswar = rand.nextInt(100)+1;
		}
	}
	
	public static void Result() {
		if(Playerguess == Noiceanswar) {
			System.out.println("You got it my comrade!!");
		}
		else if(Playerguess != Noiceanswar) {
			System.out.println("You stupid, GAME OVER");
		}
		System.out.println("Press 1 if you want to play again else press 2 to exit if you are a pussy");
		 int Playerchooce = Exception();
		 if (Playerchooce == 1) {
			 TalSpelet ();
		 }
		 else if (Playerchooce == 2) {
			 System.exit(0);
		 }
		 }
	
	
	public static void Hint() {
		if(isdifficultymedium && guesses > 10) {
			System.out.println("You have no hints left! noob");
		}
		
		else if(isdifficultyhard && guesses > 1 ) {
			System.out.println("You have no hints left! noob");
		}
		
	}
	public static void Playagain() {
		System.out.println("Shalom my comrade, welcome to my epic game!");
		Choosedifficulty();
		Exception();
		Choosedifficultyeasy();
		Choosedifficultymedium();
		Choosedifficultyhard();
		Random();
		Result();
		Hint();
	}
	
		}
	
