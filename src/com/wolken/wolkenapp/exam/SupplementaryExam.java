package com.wolken.wolkenapp.exam;

public class SupplementaryExam extends Exam {
	
	public boolean allow(HallTicket ticket) {
		System.out.println("inside supplementary");
		return super.allow(ticket);
	}
}
