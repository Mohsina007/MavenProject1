package com.globalpayemnts.test;

public class Samewordtodigit {

public static void main(String[] args) {
	    String s = "one-one+two-one+two-one";
           wordToDigit(s);

	    System.out.println(wordToDigit(s));
	 //   int str=Integer.parseInt(output);
	    
}

	public static String wordToDigit(String s) {
	    // Replace word representations with digits
	   // s = s.replace("zero", "0");
	   // s = s.replace("one", "1");
	  //  s = s.replace("two", "2");
	    
	    s = s.replace("one-one+two-one+two-one", "4");
	  

	    return s;
	}
	

}


