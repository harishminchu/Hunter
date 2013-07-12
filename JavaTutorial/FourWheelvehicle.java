package com.nth.test;

public class FourWheelvehicle {

	public FourWheelvehicle(String steering) {
		this.steering = steering;
	}

	final private int noOfWheel = 4;
	final private String steering;


	
	
	public int getNoOfWheel() {
		return noOfWheel;
	}




	public String getSteering() {
		return steering;
	}




	public final FourWheelvehicle changeSteering(String changeSteering) {

		return new FourWheelvehicle(changeSteering);
	}

}
