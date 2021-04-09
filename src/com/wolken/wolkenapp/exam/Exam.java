package com.wolken.wolkenapp.exam;

public class Exam {

		public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public HallTicket getHallTicket() {
		return hallTicket;
	}

	public void setHallTicket(HallTicket hallTicket) {
		this.hallTicket = hallTicket;
	}

		private int fees;
		private String code;
		public HallTicket hallTicket;
		
		public boolean allow(HallTicket hallTicket) {
			System.out.println("inside allow method");
			boolean check=false;
			if(fees > 1000) {
				check=true;
				if(hallTicket != null) {
						this.hallTicket= hallTicket;
						this.hallTicket.displayInfo();
				}
				else {
					System.out.println("No hallticket found");
				}
			}
			else if(fees>5000  && fees<10000){
				System.out.println("Dont pay half fees");
			}
			else {
				System.out.println("Please pay the fees");
			}
			return check;		
		}
}
