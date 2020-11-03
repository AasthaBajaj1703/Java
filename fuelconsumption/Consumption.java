package fuelconsumption;

public class Consumption {
	double fuel;
	double distance;

	public double calculatingEuropean(){
		double fuelconsumed = (fuel/distance)*100;
		return fuelconsumed;
	}
	public double calculatingUS() {
		double fuelconsumed = (distance*0.6214)/(fuel*0.2642);
		return fuelconsumed;
	}
	
	}

