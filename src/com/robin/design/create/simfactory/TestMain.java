package com.robin.design.create.simfactory;

public class TestMain {

	/**
	 * 简单工厂模式
	 * 简单工厂模式的工厂类一般是使用静态方法，通过接收的参数的不同来返回不同的对象实例。
	 * 不修改代码的话，是无法扩展的。
	 */
	public static void main(String[] args) {
		
		Factory f = new Factory();
		IProduct pA = f.getPro("A");
		pA.name();
		IProduct pB = f.getPro("B");
		pB.name();
		
	}
	
}
