package com.robin.design.structure.adapter;
//具体目标类，只提供普通功能  
public class ConTarget implements Target{

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("目前我会说日语");
	}

}
