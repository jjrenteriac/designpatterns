package com.epam.proxy;

public class ATMProxy implements GetATMData {

	public String getATMState() {
		ATMMachine realATMMachine = new ATMMachine();
		return realATMMachine.getATMState();
	}
	
	public int getCashInMachine() {
		ATMMachine realATMMachine = new ATMMachine();
		return realATMMachine.getCashInMachine();
	}
	
}
