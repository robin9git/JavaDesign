package com.robin.design.create.builder;

public class ComputerDirector {

	ComputerBuilder builder;
	  
	  public Dell createDell(){
	    builder =  new DellBuilder();
	    builder.buildCpu();
	    builder.buildGraphicCard();
	    builder.buildHardDisk();
	    builder.buildMonitor();
	    builder.buildRam();
	    builder.buildOS();
	    return (Dell) builder.getResult();
	  }
	  public Lenovo createLenove(){
	    builder =  new LenovoBuilder();
	    builder.buildCpu();
	    builder.buildGraphicCard();
	    builder.buildHardDisk();
	    builder.buildMonitor();
	    builder.buildRam();
	    builder.buildOS();
	    return  (Lenovo) builder.getResult();
	  }
	
}
