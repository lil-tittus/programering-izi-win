package Spel;

import java.util.Random;
import java.util.Scanner;

public class Talspelet {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(welcome());

        System.out.println("Choose a difficulty: \n");
        System.out.println("1) Easy, 2) Normal, 3) Hard");
        System.out.println("Enter a number: ");
        System.out.println("You have choosen number " + chooseDifficulty());



    }
    
        public static String welcome () {
            return "Shalom my friend, welcome to my epic game!";
        }

        public static int chooseDifficulty(){
            Scanner input = new Scanner(System.in);
            int answerDifficulty = input.nextInt();
            int answerDifficulty1 = answerDifficulty;
            return answerDifficulty1;
        }
        
        
}
