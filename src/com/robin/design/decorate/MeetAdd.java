package com.robin.design.decorate;

<<<<<<< HEAD

=======
>>>>>>> c321984b959a31c7402d21673c775a017d397aa5
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
