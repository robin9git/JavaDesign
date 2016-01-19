package com.robin.design.decorate;

<<<<<<< HEAD

=======
>>>>>>> c321984b959a31c7402d21673c775a017d397aa5
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
