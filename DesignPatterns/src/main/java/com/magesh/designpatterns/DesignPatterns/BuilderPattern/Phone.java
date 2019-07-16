package com.magesh.designpatterns.DesignPatterns.BuilderPattern;

public class Phone {
	
	private String model;
	private String type;
	private String ram;
	private String processor;
	private int cost;
	
	
	public Phone(PhoneBuilder phoneBuilder) {
		this.model=phoneBuilder.getModel();
		this.type=phoneBuilder.getType();
		this.processor=phoneBuilder.getProcessor();
		this.ram=phoneBuilder.getRam();
		this.cost=phoneBuilder.getCost();
	}
	
	@Override
	public String toString() {
		return "Phone [model=" + model + ", type=" + type + ", ram=" + ram + ", processor=" + processor + ", cost="
				+ cost + "]";
	}

	public String getModel() {
		return model;
	}
	public String getType() {
		return type;
	}
	public String getRam() {
		return ram;
	}
	public String getProcessor() {
		return processor;
	}
	public int getCost() {
		return cost;
	}

}
