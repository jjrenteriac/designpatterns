package com.epam.decorator.pizza;

import com.epam.decorator.decorators.Ham;
import com.epam.decorator.decorators.Pepperoni;
import com.epam.decorator.decorators.TomatoSauce;

public class PizzaMaker {
		
	public static void main(String[] args) {
		
		Pizza decorator = new TomatoSauce(new Pepperoni(new Ham(new PlainPizza())));
		
		System.out.println("Pizza ingredients: "+ decorator.getDescription());
		
		System.out.println("Total cost: " + decorator.getCost());

	
	}
}
