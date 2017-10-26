package com.epam.proxy;

public class TestProxy {

	public static void main(String[] args) {
		
		GetATMData atmProxy = new ATMProxy();
		
		System.out.println("Estate of ATM: " + atmProxy.getATMState());
		System.out.println("Cash in ATM: " + atmProxy.getCashInMachine());
		
		
		
	}
	
	
}
