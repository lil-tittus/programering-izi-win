package programering;

import java.util.Scanner;

public class repetition {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		System.out.println(biggest(x, y));
	}
	
	public static int biggest (int x, int y) {
		int bigNum = 0;
		
		if(x>y) {
			x = bigNum;
		}
		
		else {
			y = bigNum;
		}
		return bigNum;
	}
}
