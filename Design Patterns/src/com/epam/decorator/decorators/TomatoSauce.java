package com.epam.decorator.decorators;

import com.epam.decorator.pizza.Pizza;
import com.epam.decorator.pizza.ToppingDecorator;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Sauce");
	}
	
	
	public String getDescription(){
		return pizza.getDescription() + ", tomato sauce";
	}
	
	public double getCost(){
		System.out.println("Cost of Sauce: " + 15.00);
		return pizza.getCost() + 15.00;
		
	}
	
}
