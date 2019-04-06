package com.design.pattern.decorator;

import java.math.BigDecimal;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public BigDecimal cost() {
		return new BigDecimal(".15").add(beverage.cost());
	}
}
