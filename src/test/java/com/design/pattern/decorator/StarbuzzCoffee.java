package com.design.pattern.decorator;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage firstCup = new Espresso();
	    System.out.println("first cup: " + firstCup.getDescription() + "; price: " + firstCup.cost());
	    
	    Beverage secondCup = new DarkRoast();
	    secondCup = new Mocha(secondCup);
	    secondCup = new Mocha(secondCup);
	    secondCup = new Whip(secondCup);
	    System.out.println("second cup: " + secondCup.getDescription() + "; price: " + secondCup.cost());
	    
	    Beverage thirdCup = new HouseBlend();
	    thirdCup = new Soy(thirdCup);
	    thirdCup = new Mocha(thirdCup);
	    thirdCup = new Whip(thirdCup);
	    System.out.println("third cup: " + thirdCup.getDescription() + "; price: " + thirdCup.cost());
	}
	
}
