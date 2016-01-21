package com.robin.design.structure.decorate;

public class MeetAdd extends Decorator{

	public MeetAdd(Noodle noodle) {
		super(noodle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String noodle() {
		// TODO Auto-generated method stub
		return noodle.noodle()+" 加一斤牛肉";
	}

}
