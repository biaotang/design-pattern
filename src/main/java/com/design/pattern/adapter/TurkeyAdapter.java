package com.design.pattern.adapter;

public class TurkeyAdapter implements Duck {

	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		//火鸡没鸭子飞的远，要让鸭子的飞行和火鸡的飞行能够对应，必须连续五次调用火鸡的fly()来完成
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}

}
