package com.robin.design.create.absfactory;

public class TestMain {

	/**
	 * 抽象工厂模式
	 * 抽象工厂是应对产品族概念的。比如说，每个汽车公司可能要同时生产轿车，货车，客车，那么每一个工厂都要有创建轿车，货车和客车的方法。
	 * 应对产品族概念而生，增加新的产品线很容易，但是无法增加新的产品。
	 */
	public static void main(String[] args) {
		
		Factory f1 = new Factory();
		f1.concreateP1().name();
		f1.concreateP2().name();
		
	}
	
}
