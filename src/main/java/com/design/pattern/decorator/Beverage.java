package com.design.pattern.decorator;

import java.math.BigDecimal;

public abstract class Beverage {

	String description = "Unknow Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract BigDecimal cost();
}
