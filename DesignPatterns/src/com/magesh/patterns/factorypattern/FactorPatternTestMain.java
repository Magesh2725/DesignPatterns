package com.magesh.patterns.factorypattern;

public class FactorPatternTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee permanent=EmployeeFactory.getInstance("magesh","1234","permanent");
		Employee contract=EmployeeFactory.getInstance("manoj","4321","contract");
		
		System.out.println("permanent "+permanent.toString());
		System.out.println("contract "+contract.toString());

	}

}
