package com.day3;

public class EmpWageBuilder {
	public static void main(String args[]) {
		System.out.println("Welcome to Employee Wage Program");
		int IS_FULL_TIME=1;
		double empwage=Math.floor(Math.random() *10)%2;
		if(empwage==IS_FULL_TIME) {
			System.out.println("Employe is present");
		}
		else {
			System.out.println("Employe is absent");
		}
		
	}

}
