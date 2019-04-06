package com.design.pattern.decorator;

import java.math.BigDecimal;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "DarkRoast";
	}
	
	@Override
	public BigDecimal cost() {
		return new BigDecimal(".65");
	}
}
