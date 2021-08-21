package com.employee;

public class EmpWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee wage Computation program!");
		final int IS_FULL_TIME =1;		//constant
		double empCheck=Math.floor(Math.random()*10)%2;
		if (empCheck==IS_FULL_TIME)		//condition to check employee is present or not
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent"); 
	}

}
