package com.lxy.fanxing.methods;

import java.util.Date;

public class Customer {

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Generator<Date> getGenerator()
	{
		return new Generator<Date>() {
			
			Date run() {
				// TODO Auto-generated method stub
				return new Date();
			}
		};
		
	}
	
	public static void main(String[] args) {
		Generator<Date> generator = new Customer().getGenerator();
		Date run = generator.run();
		System.out.println(run.toString());
	}
}
