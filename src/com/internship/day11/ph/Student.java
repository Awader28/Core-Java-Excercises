package com.internship.day11.ph;

public class Student {

	private Address address;
	private String sname;

	/**
	 * @param address
	 * @param sname
	 */
	public Student(Address address, String sname) {
		super();
		this.address = address;
		this.sname = sname;
	}

	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "[Address=" + address + ", Student Name=" + sname + "]";
	}

}
