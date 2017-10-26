package com.epam.facade;

public class FacadePrinter {

	private Printer printer;
	
	public void print(String data){
		printer = new Printer();
		printer.setName("HP-Printer");
		printer.setPaper("A4");
		printer.setData(data);
		printer.print();
		
	}
}
