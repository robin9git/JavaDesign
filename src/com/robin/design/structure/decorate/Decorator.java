package com.robin.design.structure.decorate;

public abstract class Decorator implements Noodle{

	Noodle noodle;
	
	public Decorator(Noodle noodle) {
		super();
		this.noodle = noodle;
	}
	
}
