package com.internship.day05.interfaceandabstract;

import java.util.Scanner;

public abstract class Definations implements I1, T2 {
	// ticket

	private int ticketNum = 0;
	private String passName = "";
	private String seatNumString = "";
	// admin

	private int flightNumber = 0;
	private String sourceString = "";
	private String destinationString = "";
	private double fuelLtr = 0.0;

	public int getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(int ticketNum) {
		this.ticketNum = ticketNum;
	}

	public String getPassName() {
		return passName;
	}

	public void setPassName(String passName) {
		this.passName = passName;
	}

	public String getSeatNumString() {
		return seatNumString;
	}

	public void setSeatNumString(String seatNumString) {
		this.seatNumString = seatNumString;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getSourceString() {
		return sourceString;
	}

	public void setSourceString(String sourceString) {
		this.sourceString = sourceString;
	}

	public String getDestinationString() {
		return destinationString;
	}

	public void setDestinationString(String destinationString) {
		this.destinationString = destinationString;
	}

	public double getFuelLtr() {
		return fuelLtr;
	}

	public void setFuelLtr(double fuelLtr) {
		this.fuelLtr = fuelLtr;
	}

	Scanner sc = new Scanner(System.in);

	@Override
	public void setCustomerData() {
		System.out.println("ENTER TICKET INFO");
		int tcno = sc.nextInt();
		System.out.println("Enter Pass Name");
		String pname = sc.next();
		System.out.println("ENTER Seat Numer");
		String snum = sc.next();
		setTicketNum(tcno);
		setPassName(pname);
		setSeatNumString(snum);
	}

	@Override
	public void getCustomerData() {
		// TODO Auto-generated method stub
		System.out.println(getTicketNum());
		System.out.println(getPassName());
		System.out.println(getSeatNumString());
	}

	@Override
	public void getFlightData() {
		// TODO Auto-generated method stub
		System.out.println(getFlightNumber());
		System.out.println(getSourceString());
		System.out.println(getDestinationString());
		System.out.println(getFuelLtr());
	}

	@Override
	public void setFlightData() {
		// TODO Auto-generated method stub
		System.out.println("ENTER FLIGHT NUM");
		int fnum = sc.nextInt();

		System.out.println("ENTER SOURCE");
		String source = sc.next();

		System.out.println("ENTER DESTIANTION");
		String desti = sc.next();

		System.out.println("ENTER FUEL TAKEN: ");
		double fuel = sc.nextDouble();
		setFlightNumber(fnum);
		setSourceString(source);
		setDestinationString(desti);
		setFuelLtr(fuel);
	}

}
