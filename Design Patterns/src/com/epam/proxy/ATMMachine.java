package com.epam.proxy;

public class ATMMachine implements GetATMData {

	int cashInMachine = 5000;
	String state = "Working";
	
	public void setCashInMachine(int cashInMachine){
		this.cashInMachine = cashInMachine;
	}
	
	public void setState(String state){
		this.state = state;
	}
	
	public String getLastOperations(){
		
		return "List of operations...";
	}
	
	public String getTodayCardsAndCVV(){
		return "List of cards and cvv...";
	}
	

	public String getATMState() {
		return this.state;
	}

	public int getCashInMachine() {
		return cashInMachine;
	}
}
