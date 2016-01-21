package com.robin.design.create.builder;

public class Dell extends Computer {

	public Dell() {
		super();
		this.setType("戴尔");
		// TODO Auto-generated constructor stub
	}

	private String graphicCard;
	private String monitor;

	public String getGraphicCard() {
		return graphicCard;
	}

	public void setGraphicCard(String graphicCard) {
		this.graphicCard = graphicCard;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public String toString() {
		return "型号:" + this.getType() + "\nCPU:" + this.getCpu() + "\n内存:"
				+ this.getRam() + "\n硬盘:" + this.getHardDisk() + "\n操作系统:"
				+ this.getOs();
	}

}
