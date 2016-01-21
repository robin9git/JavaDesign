package com.robin.design.create.builder;

public class DellBuilder implements ComputerBuilder {

	private Dell dell = new Dell();
	  @Override
	  public void buildCpu() {
	    dell.setCpu("8核CPU");
	  }

	  @Override
	  public void buildRam() {
	    dell.setRam("8GB内存");
	  }

	  @Override
	  public void buildHardDisk() {
	    dell.setHardDisk("2T硬盘");
	  }

	  @Override
	  public void buildGraphicCard() {
	    dell.setGraphicCard("AMD显卡");
	  }

	  @Override
	  public void buildMonitor() {
	    dell.setMonitor("20英寸显示器");
	  }

	  @Override
	  public void buildOS() {
	    dell.setOs("window8操作系统");
	  }

	  @Override
	  public Computer getResult() {
	    return dell;
	  }

}
