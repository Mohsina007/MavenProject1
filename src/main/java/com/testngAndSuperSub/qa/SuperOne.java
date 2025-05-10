package com.testngAndSuperSub.qa;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class SuperOne {

	
	int x;
	int y=500;
	String firstname;
	String lastname = "Sultan";	
	
	
    public void method2() {
	System.out.println("I'm method2 from Superclass");
	
	int z=200;
	System.out.println("Local Variable Z from method2 from Super class: "+ z);
	
    }
	
	public String method1() {
	System.out.println("I'm Method1 from Superclass");
	int c=999;
	System.out.println("I'm local variavle C value in method1 super class :"+c);
		return firstname;
		
	}

	public static void main(String[] args) {
	
		
	System.out.println("print main method from super");
		
	
	}
	
	
	@BeforeMethod
	
	public void method4() {
		System.out.println("Before Method: TestNg Annotation- I'm from superclass method4 ");
	
	
	}
	
	
	
	
	
}
