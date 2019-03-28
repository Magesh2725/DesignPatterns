package com.magesh.patterns.singletonpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingletonTestClass {

	public static void main(String[] args) throws Exception  {
		
Singleton s1=Singleton.getObj();
Singleton s2=Singleton.getObj();
printObject("s1", s1);
printObject("s2", s2);

//Breaking singleton using reflection
Class clazz=Class.forName("com.magesh.patterns.singletonpattern.Singleton");
Constructor<Singleton> cotr=clazz.getDeclaredConstructor();
cotr.setAccessible(true);
Singleton s3=cotr.newInstance();
printObject("s3", s3);

//Breaking Singleton using Seriliazation

ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("/s3.serv"));
objectOutputStream.writeObject(s2);

ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("/s3.serv"));
Singleton s4=(Singleton) objectInputStream.readObject();

printObject("s4", s4);

//Breaking Singleton using Clone

Singleton S5=(Singleton) Singleton.getObj().clone();

printObject("s5",S5);

	}
	
	public static void printObject(String obj,Object object)
	{
		System.out.println(String.format("hahcode for object %s is %d", obj,object.hashCode()));
		
	}

}
