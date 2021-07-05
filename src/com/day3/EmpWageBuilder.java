package com.day3;

public class EmpWageBuilder {
	public static void main(String args[]) {
		System.out.println("Welcome to Employee Wage Program");
		int WagePerHour=20;
		int FullDayHour=8;
		int IS_PART_TIME=2;
		int DailyWage= 0;
		int IS_FULL_TIME=1;
		int EmpHour=0;
		
		double empwage=Math.floor(Math.random() *10)%3;
		if(empwage==IS_PART_TIME) 
			EmpHour=8;
		
			else if(empwage==IS_FULL_TIME) 
						EmpHour=4;
			
			else 
			EmpHour=0;
			DailyWage=WagePerHour*EmpHour;
			System.out.println("Employe is absent");}}



