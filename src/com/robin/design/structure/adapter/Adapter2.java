package com.robin.design.structure.adapter;

public class Adapter2 implements Target{

	Adaptee adaptee;
	
	public Adapter2(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		adaptee.sayLanguage();
	}
	
}
