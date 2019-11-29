package enums;

import java.util.Scanner;

public class javabiggay {
	
	static double g = 9.82;
	static double R = 8.3144621;
	static double G = 6.67408*Math.pow(10, -11);
	static double p_0 = 1000;
	static double c = 299792458;

	public static void main(String[] args) {
		
		System.out.println(volumeToMass(SolidTable.IRON, 0.06));

		System.out.println(svtDistance(2.7, 3000));

		System.out.println(heatFluid(FluidTable.WATER, 4, FluidTable.WATER.boilPoint));

		System.out.println(pressureUnderWater(75));

		System.out.println(velocityToHeight(16.667));
		
		System.out.println(power (work(Force(735),(100 / 3.6 * 4.8)),4.8));
		
		//How much is 100 fahrenheit in Celsius?
		System.out.println(fahrenheitToCelsius(100) + "C");
		
		//Whats the kinetic energy at an object with the mass 50g and velocity 10 m/s?
		System.out.println(kineticEnergy(50.0, 10.0) + "J");
		
		//How long time has a car traveled with the distance 20m and velocity 5m/s?
		System.out.println(svtTime(20.0,5.0));
		
		
		
	
		
		
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
	
	/**
	 * Ber�knar ut str�cka med hj�lp av hastighet och tid
	 * @param velocity Den spisifika hastigheten
	 * @param time Den spisifika tiden
	 * @return L�ngden p� str�ckan
	 */
	public static double svtDistance(double velocity, double time) {
		
		return velocity * time;
	}
	
	/**
	 * Ber�knar ut tid f�r hj�lp av str�cka och hastighet
	 * @param distance Den spisifika l�ngden p� str�ckan i m
	 * @param velocity Den spisifika hastigheten i m/s
	 * @return Den spisifika tiden
	 */
	public static double svtTime(double distance, double velocity) {
		
		return distance/velocity;
	}
	
	/**
	 * Calculates the work with the help of force and distance
	 * @param force The specific value of force in N
	 * @param distance The specific value of distance in M
	 * @return The value of work in Nm
	 */
	public static double work(double force, double distance) {
		
		return force * distance;
	}
	
	/**
	 * Calculates the efficiency with the help of work and time
	 * @param work The specific value of work in Nm
	 * @param time The specific time in s
	 * @return The value of efficiency in Nm/s
	 */
	public static double power(double work, double time) {
		
		return work/time;
	}
	
	/**
	 * Calculate how much energy it takes to heat a certain material a given amount of degrees.
	 * @param solid The specific material
	 * @param mass The specific amount of kg
	 * @param deltaT Data for the difference in temperature
	 * @return The energy it takes to heat the material
	 */
	public static double heatSolid(SolidTable solid, double mass, double deltaT) {
		
		return solid.heatCapacity * mass * deltaT;
	}
	
	/**
	 * Calculate how much energy it takes to heat a certain fluid a given amount of degrees
	 * @param fluid The specific fluid you want to heat
	 * @param mass The specific mass of the fluid in kg
	 * @param deltaT Data for the difference in temperature
	 * @return The energy it takes to heat the fluid
	 */
	public static double heatFluid(FluidTable fluid, double mass, double deltaT) {
		
		return fluid.heatCapacity * mass * deltaT;
	}
	
	/**
	 * Calculate how much energy it takes to heat a certain gas a given amount of degrees
	 * @param gas The specific gas
	 * @param mass The specific mass of the gas in kg
	 * @param deltaT Data for the difference in temperature
	 * @returnThe energy it takes to heat the gas
	 */
	public static double heatGas(GasTable gas, double mass, double deltaT) {
		
		return gas.heatCapacity * mass * deltaT;
	}
	 /**
	  * Calculates the height an object with a certain velocity can achieve
	  * @param velocity The specific velocity 
	  * @return The height the object will achieve
	  */
	public static double velocityToHeight(double velocity) {
		
		return Math.pow(velocity, 2)/ (2*g);
	}
	
	/**
	 * Calculates the force with help of the mass and the gravity
	 * @param mass The specific mass in kg
	 * @return The force in N
	 */
	public static double Force (double mass) {
		
		return mass*g;
	}
	
}