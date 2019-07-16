package com.magesh.patterns.factorypattern;

public class PermanentEmployee extends Employee {
	public PermanentEmployee(String name, String phoneno, String type, String salary) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.type = type;
		this.salary = salary;
	}

	private String name;
	private String phoneno;
	private String type;

	private String salary;

	

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
	
	

}
