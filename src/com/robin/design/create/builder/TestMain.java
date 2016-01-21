package com.robin.design.create.builder;

public class TestMain {

	/**
	 * 工厂类模式提供的是创建单个类的模式，
	 * 而建造者模式则是将 [各种产品集中起来进行管理，用来创建复合对象]
	 * 所谓复合对象就是指某个类具有不同的属性
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerDirector director = new ComputerDirector();
	    Dell dell =  director.createDell();
	    Lenovo lenove =director.createLenove();
	    System.out.println("**********Dell笔记本***********");
	    System.out.println(dell);
	    System.out.println("**********Lenove笔记本***********");
	    System.out.println(lenove);
		
	}

}
