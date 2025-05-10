package com.globalpayemnts.test;

import java.util.HashMap;
import java.util.Map;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;



public class TestScript1 {

	public static void main(String[] args) {
	
		  String s ="one+two-one-one+two+one"; 

        // Create a HashMap for word-to-digit mapping
        HashMap<String, Integer> wordToDigit = new HashMap<String, Integer>();
        wordToDigit.put("one", 1);
        wordToDigit.put("two", 2);

        // Replace words with digits using the HashMap
        for (String word : wordToDigit.keySet()) {
            s = s.replace(word, String.valueOf(wordToDigit.get(word)));
        }

        // Split the string for calculation
        int result = 0;
        int sign = 1; // Default sign is positive
        StringBuilder num = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '+') {
                result += sign * Integer.parseInt(num.toString());
                sign = 1; // Reset to positive
                num = new StringBuilder();
            } else if (c == '-') {
                result += sign * Integer.parseInt(num.toString());
                sign = -1; // Switch to negative
                num = new StringBuilder();
            } else {
                num.append(c);
            }
        }

        // Add the last number
        if (num.length() > 0) {
            result += sign * Integer.parseInt(num.toString());
        }

        System.out.println("Result: " + result);
    }
	


	

	

}
