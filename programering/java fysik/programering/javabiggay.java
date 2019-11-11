package programering;

import java.util.Scanner;

public class javabiggay {

	public static void main(String[] args) {
		
		System.out.println(fahrenheitToCelsius(50.0));
	}
	
	//Metod för fahrenheit till celcius
	public static double fahrenheitToCelsius (double fahrenheit) {
		double celcius = ((fahrenheit-32)*5)/9;
		return celcius;
	
	}
	
	
}
	