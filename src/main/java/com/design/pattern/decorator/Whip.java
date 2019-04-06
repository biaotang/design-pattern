package com.design.pattern.decorator;

import java.math.BigDecimal;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public BigDecimal cost() {
		return new BigDecimal(".35").add(beverage.cost());
	}
}
