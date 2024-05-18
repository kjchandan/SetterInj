package com.tap.SetterInj.classes;

public class Infotainment {
	String brand;
	
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void getInfo() {
		System.out.println("This car has "+ brand +"Infotainment");
	}


	
}
