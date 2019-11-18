package enums;

import java.util.Scanner;

public class javabiggay {

	public static void main(String[] args) {
		
		System.out.println(fahrenheitToCelsius(50.0));
		System.out.println(kelvinToCelcius(0.0));
		System.out.println(fluidPressure(FluidTable.WATER, 10));
		System.out.println(pressureUnderWater(10));
		System.out.println(kineticEnergy(2,2));
	}
	
	//Metod för fahrenheit till celcius
	public static double fahrenheitToCelsius (double fahrenheit) {
		double celcius = ((fahrenheit-32)*5)/9;
		return celcius;
	
	}
	//Metod för kelvin till celcius
	public static double kelvinToCelcius (double kelvin) {
		double celcius = (kelvin-273.15);
		return celcius;
	}
	
	public static double fluidPressure(FluidTable fluid, double deep) {
		
		double pressure = (fluid.density * 9.82 * deep);
		return pressure;
	}
	
	public static double pressureUnderWater(double deep) {
	
		double pressureWater = FluidTable.WATER.density * 9.82 * deep;
		return pressureWater;
	
	}
	
	public static double kineticEnergy(double mass, double velocity) {
		
		double kineticEnergy = mass * Math.pow(velocity, 2) / 2;
		return kineticEnergy;
	}
}
	