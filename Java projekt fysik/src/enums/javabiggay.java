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
		System.out.println(heatSolid(SolidTable.IRON,1,2));
		System.out.println(heatFluid(FluidTable.WATER,1,10));
		System.out.println(heatGas(GasTable.AIR,1,1));
		System.out.println(velocityToHeight(9.82));
	}
	
	/**
	 * Omvandlar fr�n fahrenheit till celsius
	 * @param fahrenheit V�rdet f�r temperatur, i fahrenheit
	 * @return Temperatur i celcuis
	 */
	public static double fahrenheitToCelsius (double fahrenheit) {
		double celcius = ((fahrenheit-32)*5)/9;
		return celcius;
	
	}

	/**
	 * Omvandlar fr�n kelvin till celcuis
	 * @param kelvin V�rdet f�r temperatur, i kelvin
	 * @return Temperatur i celcius
	 */
	public static double kelvinToCelcius (double kelvin) {
		double celcius = (kelvin-273.15);
		return celcius;
	}
	
	/**
	 * Trycket i en viss v�tska
	 * @param fluid Den spesifika v�tskan
	 * @param deep Hur djupt ner
	 * @return Trycket
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		
		double pressure = (fluid.density * g * deep);
		return pressure;
	}
	
	/**
	 * Ber�knar trycket i vatten
	 * @param deep Hur djupt ner i vatten
	 * @return Trycket i vatten
	 */
	public static double pressureUnderWater(double deep) {
	
		double pressureWater = FluidTable.WATER.density * g * deep;
		return pressureWater;
	
	}
	
	/**
	 * Ber�knar den kenetiska energin
	 * @param mass Den spisifika massan
	 * @param velocity Dan spisifika hastigheten
	 * @return den kenetiska energin
	 */
	public static double kineticEnergy(double mass, double velocity) {
		
		double kineticEnergy = mass * Math.pow(velocity, 2) / 2;
		return kineticEnergy;
	}
	
	/**
	 * Ber�knar den potentiella energin
	 * @param mass Den spisifika massan
	 * @param height Den spsifika h�jden
	 * @return Den potentiella energin
	 */
	public static double potentialEnergy(double mass, double height) {
		
		return mass * g * height;
	}

	/**
	 * Ber�knar hur h�g hastighet n�r man faller ett f�rem�l
	 * @param height Den spisifika h�jden
	 * @return Hastigheten
	 */
	public static double fallSpeed(double height) {
		
		return Math.sqrt(2 * g * height);
	}
	
	/**
	 * Ber�knar skillnaden mellan tv� v�rden
	 * @param first F�rsta v�rdet
	 * @param last Andra v�rdet
	 * @return Skillnaden
	 */
	public static double delta(double first, double last) {
		
		return last - first;
	}
	
	/**
	 * F�rvanlar en v�tska med en viss volym till massa
	 * @param fluid Den spisifika v�tskan
	 * @param volume Det spisifika v�rdet p� volymen
	 * @return V�rdet p� massan
	 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		
		return fluid.density * volume; 
	}
	
	/**
	 * G�r om en viss volym av gas till en massa
	 * @param gas Den spisifika gasen
	 * @param volume Det spisifika v�rdet p� volymen
	 * @return V�rdet p� massan
	 */
	public static double volumeToMass(GasTable gas, double volume) {
		
		return gas.density * volume;
	}
	
	/**
	 * G�r om en viss volym av materia till en massa
	 * @param solid Den spisifika materian
	 * @param volume Det spisifika v�rdet p� volymen
	 * @return V�rdet p� massan
	 */
	public static double volumeToMass(SolidTable solid, double volume) {
		
		return solid.density * volume; 
	}
	
	/**
	 * Ber�knar ut medelhastigheten med hj�lp av str�cka och tid
	 * @param distance Den spisifika str�ckan
	 * @param time Den spisifika tiden
	 * @return Medelhastigheten
	 */
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
	
	public static double heatGas(GasTable gas, double mass, double deltaT) {
		
		return gas.heatCapacity * mass * deltaT;
	}
	
	public static double velocityToHeight(double velocity) {
		
		return Math.pow(velocity, 2)/ (2*g);
	}
}