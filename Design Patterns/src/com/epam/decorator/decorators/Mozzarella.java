package com.epam.decorator.decorators;

import com.epam.decorator.pizza.Pizza;
import com.epam.decorator.pizza.ToppingDecorator;

public class Mozzarella extends ToppingDecorator {

	public Mozzarella(Pizza pizza) {
		super(pizza);
		System.out.println("Adding mozzarella");
	}
	
	public String getDescription(){
		return pizza.getDescription() + ", mozzarella";
	}
	
	public double getCost(){
		System.out.println("Cost of mozzarella: " + 20.00);
		return pizza.getCost() + 20.00;
		
	}
	
}