package com.globalpayemnts.test;

public class StringEqual {

	public static void main(String[] args) {
String s="moon";
String n="moon";
boolean result=s.equals(n);
System.out.println(result);



String s1="moon";
String n1="Moon";
boolean result1=s1.equals(n1);
System.out.println(result1);


String s2="moon";
String n2="Moon";
boolean result2=s2.equalsIgnoreCase(n2);
System.out.println(result2);
/////////

String text1="hello";
String text2= new String();
text2="hello";
boolean printResult=text1.contains(text2);
System.out.println(printResult);

///we use arrays.toString to print an array when only we have an array to print
	}

}
