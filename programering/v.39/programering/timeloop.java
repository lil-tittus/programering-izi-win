package programering;

import java.util.Scanner;

public class timeloop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.println("Ange V�rde");
		int x = input.nextInt();
		
		for (int i = 1; i <= x; i++) {
			System.out.println(i +"\t" + "Abracadabra");
		}
	}
}
