package com.magesh.patterns.factorypattern;

public class EmployeeFactory {
	
	public static Employee getInstance(String name,String phone,String type)
	{ 
		
		
		if("permanent".equals(type))
		{
			return new PermanentEmployee(name, phone, type, "permanentSalary");
		}
		else if("contract".equals(type))
		{
			return new ContractEmployee(name, phone, type, "contractSalary");
			
		}
		return null;
	}

}
