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
		
	
		
		
	}
	
	/**
	 * Omvandlar från fahrenheit till celsius
	 * @param fahrenheit Värdet för temperatur, i fahrenheit
	 * @return Temperatur i celcuis
	 */
	public static double fahrenheitToCelsius (double fahrenheit) {
		double celcius = ((fahrenheit-32)*5)/9;
		return celcius;
	
	}

	/**
	 * Omvandlar från kelvin till celcuis
	 * @param kelvin Värdet för temperatur, i kelvin
	 * @return Temperatur i celcius
	 */
	public static double kelvinToCelcius (double kelvin) {
		double celcius = (kelvin-273.15);
		return celcius;
	}
	
	/**
	 * Trycket i en viss vätska
	 * @param fluid Den spesifika vätskan
	 * @param deep Hur djupt ner
	 * @return Trycket
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		
		double pressure = (fluid.density * g * deep);
		return pressure;
	}
	
	/**
	 * Beräknar trycket i vatten
	 * @param deep Hur djupt ner i vatten
	 * @return Trycket i vatten
	 */
	public static double pressureUnderWater(double deep) {
	
		double pressureWater = FluidTable.WATER.density * g * deep;
		return pressureWater;
	
	}
	
	/**
	 * Beräknar den kenetiska energin
	 * @param mass Den spisifika massan
	 * @param velocity Dan spisifika hastigheten
	 * @return den kenetiska energin
	 */
	public static double kineticEnergy(double mass, double velocity) {
		
		double kineticEnergy = mass * Math.pow(velocity, 2) / 2;
		return kineticEnergy;
	}
	
	/**
	 * Beräknar den potentiella energin
	 * @param mass Den spisifika massan
	 * @param height Den spsifika höjden
	 * @return Den potentiella energin
	 */
	public static double potentialEnergy(double mass, double height) {
		
		return mass * g * height;
	}

	/**
	 * Beräknar hur hög hastighet när man faller ett föremål
	 * @param height Den spisifika höjden
	 * @return Hastigheten
	 */
	public static double fallSpeed(double height) {
		
		return Math.sqrt(2 * g * height);
	}
	
	/**
	 * Beräknar skillnaden mellan två värden
	 * @param first Första värdet
	 * @param last Andra värdet
	 * @return Skillnaden
	 */
	public static double delta(double first, double last) {
		
		return last - first;
	}
	
	/**
	 * Förvanlar en vätska med en viss volym till massa
	 * @param fluid Den spisifika vätskan
	 * @param volume Det spisifika värdet på volymen
	 * @return Värdet på massan
	 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		
		return fluid.density * volume; 
	}
	
	/**
	 * Gör om en viss volym av gas till en massa
	 * @param gas Den spisifika gasen
	 * @param volume Det spisifika värdet på volymen
	 * @return Värdet på massan
	 */
	public static double volumeToMass(GasTable gas, double volume) {
		
		return gas.density * volume;
	}
	
	/**
	 * Gör om en viss volym av materia till en massa
	 * @param solid Den spisifika materian
	 * @param volume Det spisifika värdet på volymen
	 * @return Värdet på massan
	 */
	public static double volumeToMass(SolidTable solid, double volume) {
		
		return solid.density * volume; 
	}
	
	/**
	 * Beräknar ut medelhastigheten med hjälp av sträcka och tid
	 * @param distance Den spisifika sträckan
	 * @param time Den spisifika tiden
	 * @return Medelhastigheten
	 */
	public static double svtVelocity(double distance, double time) {
		
		return distance/time;
	}
	
	/**
	 * Beräknar ut sträcka med hjälp av hastighet och tid
	 * @param velocity Den spisifika hastigheten
	 * @param time Den spisifika tiden
	 * @return Längden på sträckan
	 */
	public static double svtDistance(double velocity, double time) {
		
		return velocity * time;
	}
	
	/**
	 * Beräknar ut tid för hjälp av sträcka och hastighet
	 * @param distance Den spisifika längden på sträckan i m
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