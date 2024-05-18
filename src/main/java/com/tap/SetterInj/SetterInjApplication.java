package com.tap.SetterInj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.SetterInj.Interfaces.car;

public class SetterInjApplication {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	
		car s = (car) ac.getBean("swift");
		car p = (car) ac.getBean("polo");
		
		s.getdetails();
		p.getdetails();
		s.getInfo();
		p.getInfo();
	}

}
