package programering;

import java.util.Scanner;
import java.util.Random;
public class Tal {
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Shalom my comrade, welcome to my epic game!");
		Choosedifficulty();
		
		
	}
	
	
	
	public static void Choosedifficulty () {
		Scanner input = new Scanner (System.in);
		System.out.println("Choosedifficulty :  \b 1(easy) \b 2(medium) \b 3(hard)");
		while (true){
			System.out.println("Choose a difficulty from 1-3");
			int Choosedifficulty = input.nextInt();
			if (Choosedifficulty  == 1 || Choosedifficulty  == 2 || Choosedifficulty  == 3) {
				break;
			
	}

	
		}
	
	}
	
	
		}
	
