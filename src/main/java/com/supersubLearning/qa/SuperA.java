package com.supersubLearning.qa;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SuperA {
	
	int paintbox=9;//global bariable
	int brush=8;
	int x;   //	//default integer value is 0
	int y= 99;
	
	
	public SuperA() {//constructor method //contructor method has no return type
		
	}

	
	public SuperA (int paintbox, int brush, int x, int y) {//parameterized constructor method
		//A compile-time polymorphism that occurs when multiple methods have the same name but 
		//different parameters, signatures, or return types
		
		this.brush=brush;//this.brush is the global avriable
		this.paintbox=paintbox;
		this.x=x;
		this.y=y;
		
	}	
	
	int displaynumberofArt() {
		return brush;
		
		
	}
	
	int displaynumberofpaint() {
		return paintbox;
		
		
	}
	
	public int printx() {
		return 9;
	}
	
	
	
	public int printy() {
		return y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperA superA = new SuperA(40,70,88,999);
		
		int prntpaint= superA.displaynumberofpaint();
		int prntbrush= superA.displaynumberofArt();
		
		int prntx = superA.printx();
		int prnty = superA.printy();
		
		
	System.out.println("numberofpaint: "+prntpaint);//so when constructor method get called then all variable value will be initialized with constructor
	System.out.println("numberofbrush: "+prntbrush);//so global variable value will be changed by the  constructor variables,if
	//global/class variable has no value then it will be considred
	
	//having default value//but if the class  has a default constructor then only global variable will be initialed with default value or value of global variable
	//but if the class have overloaded constructor and have a parameterized constructor that has global variable equal to parameter means when class object will be
	//created then constructor will get called and parameterized constructor will get called and variable will be initialized by parameter variable 
	
	
	System.out.println(prntx);
	
	System.out.println(prnty);
	
	
	
	}

}
