package com.tap.SetterInj.Impl;

import com.tap.SetterInj.Interfaces.car;
import com.tap.SetterInj.classes.Infotainment;

public class polo implements car {

	String model;
	Infotainment i;
	
	public void setmodel(String model) {
		this.model = model;
	}

	public void setI(Infotainment i) {
		this.i = i;
	}

	@Override
	public void getdetails() {
		System.out.println("This is a " + model);

	}
	
	public void getInfo() {
		i.getInfo();
	}

}
