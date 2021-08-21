package com.employee;

public class EmpWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Employee wage Computation program!");
		
		int Emp_Hrs=0;					//local variable
		int Emp_Wage=0;
		final int IS_FULL_TIME =1;		//constant
		final int EMP_RATE_PER_HOUR=20;
		double empCheck=Math.floor(Math.random()*10)%2;
		if (empCheck==IS_FULL_TIME)		//condition to check employee is present or not
			Emp_Hrs=8;
		Emp_Wage=Emp_Hrs*EMP_RATE_PER_HOUR ;	//calculating daily employee wage
		System.out.println("Employee wage is "+Emp_Wage);
	}

}

		
				
		