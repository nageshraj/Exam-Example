package com.wolken.wolkenapp.exam;


public class ExamUtil {
	public static void main(String a[]) {
			Exam exam=new Exam();
			exam.setCode("IS744");
			exam.setFees(6000);
			
			HallTicket hallTicket =  new HallTicket("12345","IS744","Signals");
			
			exam.allow(hallTicket); // caller- arguments
			
			Exam supplementaryExam = new SupplementaryExam();
			supplementaryExam.allow(hallTicket);
			
			
	}
}
