package com.magesh.designpatterns.DesignPatterns;

import com.magesh.designpatterns.DesignPatterns.BuilderPattern.Phone;
import com.magesh.designpatterns.DesignPatterns.BuilderPattern.PhoneBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    			//Testing builderpattern
    	
    	Phone phone=new PhoneBuilder("Nokias","Smartphone").build();
    	System.out.println(phone.toString());
    	Phone phone2=new PhoneBuilder("Nokias","Smartphone").ram("2GB").processor("300MHz").cost(4000).build();
    	System.out.println(phone2.toString());
    	
    }
}
