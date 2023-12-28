package com.internship.day04.abstractexxpl;

public abstract class Details {
	
	private int eId;
	private String name;
	private String city;
	
	abstract void getFullData();
	abstract void getPartData();
	
	abstract void setFulldata();
	abstract void setPartdata();
	
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	

}
