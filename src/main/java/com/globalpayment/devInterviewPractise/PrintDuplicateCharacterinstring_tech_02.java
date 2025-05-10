package com.globalpayment.devInterviewPractise;

public class PrintDuplicateCharacterinstring_tech_02 {

	public static void main(String[] args) {
		
	String sentence=" TODO Auto-generated method stub";
	
	char[] ch=sentence.toLowerCase().toCharArray();//convert the string to array of character
	
	int count;
	for (int i=0; i<ch.length;i++){
		count=0;
		if(ch[i]=='0')
			continue;
		for (int j=i+1;j<ch.length;j++) {
			if (ch[i]==ch[j]) {
				ch[j]='0';
				count++;						
			}
		}
		if(count>0)
		System.out.println(ch[i]+ " ,");
	}
	System.out.println("\nString1: "+ sentence);
	System.out.println("\nString2: "+ String.valueOf(ch));
	}

}
