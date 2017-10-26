package com.epam.decorator.decorators;

import com.epam.decorator.pizza.Pizza;
import com.epam.decorator.pizza.ToppingDecorator;

public class Pepperoni extends ToppingDecorator {

	public Pepperoni(Pizza pizza) {
		super(pizza);
		System.out.println("Adding pepperoni");
	}

	public String getDescription() {
		return pizza.getDescription() + ", pepperoni";
	}

	public double getCost() {
		System.out.println("Cost of pepperoni: " + 25.00);
		return pizza.getCost() + 25.00;

	}

}