package com.globalpayment.devInterviewPractise;

public class PrintAllCharacterinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence= "how many duplicates character in the string";
		//sentence.length();
	     System.out.println(sentence.length());
	     //sentence.charAt(6);	  //0 theke start 
	     System.out.println(sentence.charAt(6));//starts from 0
	     	
	     //print all the characters from a string
	     System.out.println("Print all character from a string in the \"sentence\" variable: ");
	     	
		for (int i =0; i<sentence.length();i++) {
			System.out.println(sentence.charAt(i));
		}
			

	}

}
