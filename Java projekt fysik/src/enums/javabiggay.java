package enums;

import java.util.Scanner;

public class javabiggay {
	
	static double g = 9.82;
	public static void main(String[] args) {
		
		System.out.println(fahrenheitToCelsius(50.0));
		System.out.println(kelvinToCelcius(0.0));
		System.out.println(fluidPressure(FluidTable.WATER, 10));
		System.out.println(pressureUnderWater(10));
		System.out.println(kineticEnergy(2,2));
		System.out.println(potentialEnergy(2,5));
		System.out.println(fallSpeed(2.5));
		System.out.println(delta(1,10));
		System.out.println(delta(5,1));
		System.out.println(volumeToMass(FluidTable.WATER,1));
		System.out.println(volumeToMass(GasTable.AIR,1));
		System.out.println(volumeToMass(SolidTable.IRON,1));
		System.out.println(svtVelocity(10,5));
		System.out.println(svtDistance(10,5));
		System.out.println(svtTime(10,2));
		System.out.println(work(50,10));
		System.out.println(power(1000,2));
		System.out.println(heat(SolidTable.IRON,1,2));
		System.out.println(heat(FluidTable.WATER,1,10));
	}
	
	//Metod f�r fahrenheit till celcius
	public static double fahrenheitToCelsius (double fahrenheit) {
		double celcius = ((fahrenheit-32)*5)/9;
		return celcius;
	
	}
	//Metod f�r kelvin till celcius
	public static double kelvinToCelcius (double kelvin) {
		double celcius = (kelvin-273.15);
		return celcius;
	}
	
	public static double fluidPressure(FluidTable fluid, double deep) {
		
		double pressure = (fluid.density * g * deep);
		return pressure;
	}
	
	public static double pressureUnderWater(double deep) {
	
		double pressureWater = FluidTable.WATER.density * g * deep;
		return pressureWater;
	
	}
	
	public static double kineticEnergy(double mass, double velocity) {
		
		double kineticEnergy = mass * Math.pow(velocity, 2) / 2;
		return kineticEnergy;
	}
	
	public static double potentialEnergy(double mass, double height) {
		
		return mass * g * height;
	}

	
	public static double fallSpeed(double height) {
		
		return Math.sqrt(2 * g * height);
	}
	
	public static double delta(double first, double last) {
		
		return last - first;
	}
	
	public static double volumeToMass(FluidTable fluid, double volume) {
		
		return fluid.density * volume; 
	}
	
	public static double volumeToMass(GasTable gas, double volume) {
		
		return gas.density * volume;
	}
	
	public static double volumeToMass(SolidTable solid, double volume) {
		
		return solid.density * volume; 
	}
	
	public static double svtVelocity(double distance, double time) {
		
		return distance/time;
	}
	
	public static double svtDistance(double velocity, double time) {
		
		return velocity * time;
	}
	
	public static double svtTime(double distance, double velocity) {
		
		return distance/velocity;
	}
	
	public static double work(double force, double distance) {
		
		return force * distance;
	}
	
	public static double power(double work, double time) {
		
		return work/time;
	}
	
	public static double heatSolid(SolidTable solid, double mass, double deltaT) {
		
		return solid.heatCapacity * mass * deltaT;
	}
	
public static double heatFluid(FluidTable fluid, double mass, double deltaT) {
		
		return fluid.heatCapacity * mass * deltaT;
}
	
}