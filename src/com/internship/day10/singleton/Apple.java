package com.internship.day10.singleton;

public class Apple {
	
	private int id=10;
	private String cityString="Pune";
	private boolean isMale=true;
	
	static final Apple a1 = new Apple();
	static Apple a2=new Apple(); //eager object initialisation 
	
	//here object gets created even before it is required therefore eager initialisation;
	
	
	private Apple() {
		
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCityString() {
		return cityString;
	}



	public void setCityString(String cityString) {
		this.cityString = cityString;
	}



	public boolean isMale() {
		return isMale;
	}



	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}



	static void PrintStuff() {
		
		//a1=new Apple(); //lazy initialisation
		
		
		a1.setCityString("Alibag");
		a1.setId(101);
		a1.setMale(false);
		
		System.out.println(a1.getCityString());
		System.out.println(a1.getId());
		System.out.println(a1.isMale());
		
		a2.setCityString("Pyun");
		a2.setId(123);
		a2.setMale(true);
		
			System.out.println();
		
		System.out.println(a2.getCityString());
		System.out.println(a2.getId());
		System.out.println(a2.isMale());
		
		
		
		
		
		
		
		
	}
	

}
