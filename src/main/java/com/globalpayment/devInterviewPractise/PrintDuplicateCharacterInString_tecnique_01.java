package com.globalpayment.devInterviewPractise;

public class PrintDuplicateCharacterInString_tecnique_01 {

	public static void main(String[] args) {
		
		String sentence="TODO Auto-generated method stub";
		System.out.println(sentence);
		
		String characters="";
		String duplicates="";
		
		for (int i=0; i<sentence.length();i++) {
			String currentcharacter= Character.toString(sentence.charAt(i));
			if (characters.contains(currentcharacter)) {
				if (!duplicates.contains(currentcharacter)) {
					duplicates+=currentcharacter + ",";	
				}
			
			}
			characters+=currentcharacter;
		}

       System.out.println(duplicates);
	}

}
