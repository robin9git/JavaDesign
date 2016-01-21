package com.robin.design.create.builder;

public class Lenovo extends Computer {

	private String graphicCard;
	  
	  public String getGraphicCard() {
	    return graphicCard;
	  }

	  public void setGraphicCard(String graphicCard) {
	    this.graphicCard = graphicCard;
	  }

	  public Lenovo(){
	    this.setType("联想笔记本");
	  }

	  public String toString() {
	    return "型号:"+this.getType()+"\nCPU:"+this.getCpu()
	        +"\n内存:"+this.getRam()+"\n硬盘:"+this.getHardDisk()
	        +"\n显卡:"+this.getGraphicCard()+"\n操作系统:"+this.getOs();
	  }
	
}
