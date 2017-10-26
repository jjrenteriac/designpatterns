package com.epam.decorator.pizza;

public class PlainPizza implements Pizza {
	 
	public PlainPizza() {
		System.out.println("Preparing dough");
	}
	public String getDescription() {
		return "Thin dough";
	}

	public double getCost() {
		System.out.println("Cost of dough: " + 40.00);
		return 40.00;
	
	}
 
}