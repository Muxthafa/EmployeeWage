package com.employee;

public class EmpWage {
			public static final int IS_PART_TIME=1;
			public static final int IS_FULL_TIME =2;
			
			private final String company;		//members of class
			private final int EMP_RATE_PER_HOUR;
			private final int NUM_WORKING_DAYS;
			private final int MAX_HRS_IN_MONTH;
			private int Total_Emp_Wage;
			
			//constructor to initialize members of a class
			public EmpWage(String company,int EMP_RATE_PER_HOUR,int NUM_WORKING_DAYS,int MAX_HRS_IN_MONTH)
			{
				this.company=company;
				this.EMP_RATE_PER_HOUR=EMP_RATE_PER_HOUR;
				this.NUM_WORKING_DAYS = NUM_WORKING_DAYS;
				this.MAX_HRS_IN_MONTH=MAX_HRS_IN_MONTH;
				
			}
			
			//method for calculating employee wages for different companies
			public void wageCalculator()
			{
				//local variables
				int Emp_Hrs=0;
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
					System.out.println("Day#: "+TotalWorkingDays+" Emp Hr: "+TotalEmpHrs);
				}
				Total_Emp_Wage=TotalEmpHrs*EMP_RATE_PER_HOUR;	
			}
			@Override
			public String toString() {
				return "Total Emp Wage for compay: "+company+ "is: "+Total_Emp_Wage;
			}
			public static void main(String[] args) 
			{

				EmpWage pacex = new EmpWage("PaceX",20,20,100);//object creation for company 1
				EmpWage titan = new EmpWage("TITAN",10,20,150);//object creation for company 2
				EmpWage infy = new EmpWage("Infy",30,20,100);//object creation for company 3
				
				// Computation
				pacex.wageCalculator();
				System.out.println(pacex);
				titan.wageCalculator();
				System.out.println(titan);
				infy.wageCalculator();
				System.out.println(infy);
			}

}

		
				
		