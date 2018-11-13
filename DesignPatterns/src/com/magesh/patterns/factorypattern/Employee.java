package com.magesh.patterns.factorypattern;

public abstract class  Employee {
	
	public abstract String getName();
	public abstract String getPhoneno();
	public abstract String getType();
	public abstract String getSalary();
	
	public  String toString()
	{
		return "name:"+getName()+" phone:"+getPhoneno()+ " Type:"+getType()+" sal:"+getSalary();
		
	}
	
	
}
