package com.testngAndSuperSub.qa;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SubTwo extends SuperOne{
	


	@Override
	public String method1() {
		
		super.method1();//eta na likhleo hoy
		
		System.out.println("I'm Overridden Method1 from Subclass ");
		String travelCountrayname="Turkey";
		System.out.println("I'm Overrideen Method1 from Subclass "+ travelCountrayname);
		return firstname;
	}
	
	
	

	
    @Test
	public void method3() {
	
	System.out.println("Test: I'm Test Annotation from sub class method3");
	method1();
	method2();
	//not only methods from super class are accecible but also variables from super class are accessible ,below is the proof
	//printing variables from super class in subclass since inherited
	
	System.out.println("Prinintg Global Variable X from super class: "+ x );//since there was no value given in super class it will print the default value for data type integer
	
	System.out.println("Prinintg Global Variable Y from super class: "+ y );
	
	System.out.println("Prinintg Global Variable firstname from super class: "+ firstname );//since there was no value given in super class default value for sting datat type will be print
	System.out.println("Prinintg Global Variable lastname from super class: "+ lastname );//value from super class was given so it will print that
	
	
	//	//Benefit  of inheritance is we did not have to create an instance/object  of a class	and then call a method in another class
	//even though we are in a different class,we can call a (non static) method from another class because we have inherited the super class content by extending
	//we can also access any variable from the super class
	}
	
	
    
  
	public static void main(String[] args) {
	
		
	System.out.println("Print static main method from Subclass");
	//method2();//static method can only call static methods from super class or any class don't have to be inherited	
	

	
	}
	
	
	@AfterTest //this test I ran to see when i can use after test in subclass even though I used before test on super
	//and it ran and passed,so I can use it in sub class
	public void method5() {
		
		System.out.println("After test annottaion: sys print method5 ");
	}
	

	

	
	
	


}
