package com.globalpayment.devInterviewPractise;

import java.util.Scanner;

public class ReverseNumber02 {

public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
int numbers;
int sum=0;
int temp ;
int r;
 numbers=scanner.nextInt();
 
temp=numbers;
while (temp!=0) {
	 r = temp%10;
	sum=sum*10+r;
	temp=temp/10;
};

System.out.println("reverse number:" +sum);
	}

}
