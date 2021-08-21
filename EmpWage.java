package com.employee;

public class EmpWage {
	public static final int IS_PART_TIME =1;	//constant
	public static final int IS_FULL_TIME =2;		
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_WORKING_DAYS=20;
	public static final int MAX_HRS_IN_MONTH=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Employee wage Computation program!");
		
		int Emp_Hrs=0;					//local variable
		int Emp_Wage=0;
		int Total_Wage=0;
		int TotalEmpHrs=0;
		int TotalWorkingDays=0;
		while(TotalEmpHrs<MAX_HRS_IN_MONTH && TotalWorkingDays<NUM_WORKING_DAYS)
		{
			TotalWorkingDays+=1;
			int empCheck=(int) (Math.floor(Math.random()*10)%3);
			switch (empCheck) 
			{
				case  IS_FULL_TIME: Emp_Hrs=16;break;
				case IS_PART_TIME: Emp_Hrs=8;break;
				default: Emp_Hrs=0;
			}
			TotalEmpHrs+=Emp_Hrs;
			Emp_Wage=Emp_Hrs*EMP_RATE_PER_HOUR ;
			Total_Wage+=Emp_Wage;
			System.out.println("Employee wage is "+Emp_Wage);
		}
		System.out.println("Total wage is "+Total_Wage);
		System.out.println("Total working hours is "+TotalEmpHrs);
		System.out.println("Total working days is "+TotalWorkingDays);
	}

}

		
				
		