package com.internship.day03.inheritence.sharedvars;

public class Details {
	
	 private int eid;
	 private String eNameString;
	 private String cityString;
	 private String desig;
	 private String deptt;
	
	public static void main(String[] args) {
		
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteNameString() {
		return eNameString;
	}

	public void seteNameString(String eNameString) {
		this.eNameString = eNameString;
	}

	public String getCityString() {
		return cityString;
	}

	public void setCityString(String cityString) {
		this.cityString = cityString;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public String getDeptt() {
		return deptt;
	}

	public void setDeptt(String deptt) {
		this.deptt = deptt;
	}
}
