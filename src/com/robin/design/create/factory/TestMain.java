package com.robin.design.create.factory;

public class TestMain {

	/**
	 * 工厂模式
	 * 工厂方法是针对每一种产品提供一个工厂类。通过不同的工厂实例来创建不同的产品实例。
	 * 在同一等级结构中，支持增加任意产品。
	 */
	public static void main(String[] args) {
		
		Factory f = new Factory();
		f.concreateP().name();
		
	}
	
}
