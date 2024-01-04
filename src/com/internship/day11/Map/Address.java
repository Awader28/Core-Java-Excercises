package com.internship.day11.Map;

public class Address {

	private String cityString;
	private int pincode;
	private String state;

	/**
	 * @param cityString
	 * @param pincode
	 * @param state
	 */
	public Address(String cityString, int pincode, String state) {
		super();
		this.cityString = cityString;
		this.pincode = pincode;
		this.state = state;
	}

	/**
	 * 
	 */
	public Address() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "[City=" + cityString + ", Pincode=" + pincode + ", State=" + state + "]";
	}

	public String getCityString() {
		return cityString;
	}

	public void setCityString(String cityString) {
		this.cityString = cityString;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	

}
