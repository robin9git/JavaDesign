package com.robin.design.create.builder;

public class LenovoBuilder implements ComputerBuilder {

	private Lenovo lenovo = new Lenovo();
	  public void buildCpu() {
	    lenovo.setCpu("8核CPU");
	  }
	  public void buildRam() {
	    lenovo.setRam("8GB内存");
	  }

	  @Override
	  public void buildHardDisk() {
	    lenovo.setHardDisk("1T硬盘");
	  }

	  @Override
	  public void buildGraphicCard() {
	    lenovo.setGraphicCard("Inter显卡");
	  }

	  @Override
	  public void buildMonitor() {
	  }

	  @Override
	  public void buildOS() {
	    lenovo.setOs("window7操作系统");
	  }

	  @Override
	  public Computer getResult() {
	    return lenovo;
	  }

}
