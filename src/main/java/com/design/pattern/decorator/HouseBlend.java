package com.design.pattern.decorator;

import java.math.BigDecimal;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "HouseBlend";
	}
	
	@Override
	public BigDecimal cost() {
		return new BigDecimal(".89");
	}
}
