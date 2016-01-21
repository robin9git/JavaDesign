package com.robin.design.structure.decorate;

public class EggAdd extends Decorator{

	public EggAdd(Noodle noodle) {
		super(noodle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String noodle() {
		// TODO Auto-generated method stub
		return noodle.noodle()+" 加一个鸡蛋";
	}

}
