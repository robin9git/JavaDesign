package com.robin.design.create.builder;

public interface ComputerBuilder {

	//建造cpu
	  public void buildCpu();
	  //建造ram
	  public void buildRam();
	  //建造硬盘
	  public void buildHardDisk();
	  //建造显卡
	  public void buildGraphicCard();
	  //建造显示器
	  public void buildMonitor();
	  //建造操作系统
	  public void buildOS();
	  //得到建造好的计算机
	  public Computer getResult();
	
}
