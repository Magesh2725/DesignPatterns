package com.magesh.patterns.singletonpattern;

import java.io.Serializable;

public class Singleton implements Serializable , Cloneable{
	
	private static Singleton obj;

	private Singleton()
	{
		System.out.println("creating");
	}
	public static Singleton getObj()
	{
		return new Singleton();
	}
	@Override
	public  Object clone()
	{
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
}
