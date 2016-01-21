package com.robin.design.create.absfactory;

public class Factory implements IFactory {

	@Override
	public ConcreateP1 concreateP1() {
		// TODO Auto-generated method stub
		return new ConcreateP1();
	}

	@Override
	public ConcreateP2 concreateP2() {
		// TODO Auto-generated method stub
		return new ConcreateP2();
	}


}
