package com.magesh.designpatterns.DesignPatterns.BuilderPattern;

public class PhoneBuilder {
	
	private final String  model;
	private final String  type;
	private String ram;
	private String processor;
	private int cost;
	public PhoneBuilder(String model, String type) {
		
		this.model = model;
		this.type = type;
		
	}
	public PhoneBuilder ram(String ram) {
		
		this.ram = ram;
		return this;
	}
	public PhoneBuilder processor(String processor) {
		
		this.processor = processor;
		return this;
	}
	public PhoneBuilder cost(int cost) {
		this.cost = cost;
		return this;
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
	public  Phone build()
	{
		Phone phone=new Phone(this);
		return phone;
		
	}
	

}
