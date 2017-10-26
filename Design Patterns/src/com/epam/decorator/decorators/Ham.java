package com.epam.decorator.decorators;

import com.epam.decorator.pizza.Pizza;
import com.epam.decorator.pizza.ToppingDecorator;

public class Ham extends ToppingDecorator{

		public Ham(Pizza newPizza) {
			super(newPizza);
			System.out.println("Adding Ham");
		}
		
		public String getDescription(){
			return pizza.getDescription() + ", Ham";
		}
		
		public double getCost(){
			System.out.println("Cost of ham: " + 10.00);
			return pizza.getCost() + 10.00;
			
		}
		
	}