package com.globalpayemnts.test;

public class Return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=sum(5,8);
		System.out.println(result);
		
	
	check(0);//void method call e system out hoyna cause kono variable return type deya jayna since void 
	//just call with parameter and inside void methos e ja likso tate system out thakle ekhane print hobe
	
	   boolean result2=  isEven(18);
	   System.out.println(result2);//jehetu is even methos er return type bolean tai sysout e variable print korar jonno data type o bolean 
	   
	
	}
	public static int  sum (int a, int b) {
		return a-b;
		
	}
	
	
	public static void check(int num) {
	    if (num < 0) {
	        System.out.println("Negative number");
	        return; // Exit early
	    }
	    System.out.println("Positive number");
	}
	
	
	public static boolean isEven(int num) {
	    return num % 2 == 0; // Returns true or false
	}
	
	
	
}
