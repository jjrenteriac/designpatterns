package com.epam.facade;

public class Printer {
	
	private String name;
	private String paper;
	private String data;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPaper() {
		return paper;
	}
	public void setPaper(String paper) {
		this.paper = paper;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public void print(){
		System.out.println(data);
	}
	
	

}
