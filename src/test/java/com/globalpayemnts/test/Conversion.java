package com.globalpayemnts.test;

public class Conversion {

	public static void main(String[] args) {
	String str="123";
     String printToString=	str.toString();//kono meaning nai toString() is used for Array.toString to print an array
	System.out.println(printToString);
	
	
	//Converts a numeric string to a primitive int.
	String str2="777";
int convertStringintointeger=	Integer.parseInt(str2);
System.out.println(convertStringintointeger);


//Returns an Integer object (wrapper class).
int number=999;
 Integer convertintegertoString=Integer.valueOf(number);
 System.out.println(convertintegertoString);
 
 ////If the string contains letters or symbols (e.g., "12a"), it will throw a NumberFormatException.
//Safe version using try-catch:	
	
 String s="one1+two";
 safeParseInt(s);
	}

//If the string contains letters or symbols (e.g., "12a"), it will throw a NumberFormatException.
// Safe version using try-catch:	
	
	public static int safeParseInt(String s) {
	    try {
	        return Integer.parseInt(s);
	 
	    } catch (NumberFormatException e) {
	        System.out.println("Invalid number: " + s);
	        return 0; // or any default/error value
	    }	
    
	}
	

}
