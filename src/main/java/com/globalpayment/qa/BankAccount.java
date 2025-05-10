package com.globalpayment.qa;

public interface BankAccount extends BrokerageAccount, CreditCard {
	//u must  have to declare an interface by writing a keyword called interface before the name 
	//one interface can extend multiple interface  thats why above I have extends more than one interface to one interface by
	//writing extends keyword.>> So in above BankAccount interface has extended  two  interface BrokerageAccount and  CreditCard these 
	
	//	//can we create a interface which don't have any method or any  veritable ?yes we can its a marker interface
	
	public static final String accountFirstName = "Waziha";
	String accountLastName="Insherah";
	
	//by default all variables in interface are constant,public,static,final
	//all interfaces have only abstract method or methods in interfaces are implicitly abstract
	//method in interface has no implementation or or no body part or no body
	
	void accountName();
	void startbalance();
	void endbance();
	void interstOnTerms();
	void withdaw();
	void deposit();

}
