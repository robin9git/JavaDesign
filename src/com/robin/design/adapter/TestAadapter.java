package com.robin.design.adapter;

public class TestAadapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Target t = new ConTarget();
		t.say();
		
		Adapter a = new Adapter();
		a.say();
		
		//第二种方式--类似于装饰器模式
		Adapter2 a2 = new Adapter2(new Adaptee());
		a2.say();
		
	}

}
