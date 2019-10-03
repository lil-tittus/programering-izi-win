package programering;

import java.util.Scanner;

public class kvadrant {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ange ett X värde");
		int x = input.nextInt();
		
		System.out.println("Ange ett Y värde");
		int y = input.nextInt();
		
		if((x > 0) && (y > 0)) {
			System.out.println("Kvadrant 1");
		}
		if((x < 0)&&(y > 0)) {
		System.out.println("Kvadrant 2");
	}
		if((x > 0)&&(y < 0)) {
			System.out.println("Kvadrant 3");
		}
		if((x < 0)&&(y < 0)) {
			System.out.println("Kvadrant 4");
			
		}
	}
}
		
		
	

