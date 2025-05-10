package com.globalpayemnts.test;

public class WordToDigit {

	public static void main(String[] args) {
	
		     //   String input = "one-one+two-one+two+one";
		     //   input = input.replace("one", "1").replace("two", "2");
		        
		        String text =  "one-one+two-one+two+one";
		        text = text.replace("one", "1").replace("two", "2");
		        String  [] fruits = text.split("[-+]");
		        for (String fruit : fruits) {
		            System.out.println(fruit.trim());
		        }
	}

	}


