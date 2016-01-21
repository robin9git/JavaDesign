package com.robin.design.create.simfactory;

public class Factory {

	public IProduct getPro(String type){
		IProduct p = null;
		if("A".equals(type)){
			p = new ProductA();
		}else if("B".equals(type)){
			p = new ProductB();
		}
		return p;
	}
	
}
