package com.employee;

public class EmpWage {
			public static final int IS_PART_TIME=1;
			public static final int IS_FULL_TIME =2;
			
			private final String company;		//members of class
			private final int EMP_RATE_PER_HOUR;
			private final int NUM_WORKING_DAYS;
			private final int MAX_HRS_IN_MONTH;
			
			//constructor to initialize members of a class
			public EmpWage(String company,int EMP_RATE_PER_HOUR,int NUM_WORKING_DAYS,int MAX_HRS_IN_MONTH)
			{
				this.company=company;
				this.EMP_RATE_PER_HOUR=EMP_RATE_PER_HOUR;
				this.NUM_WORKING_DAYS = NUM_WORKING_DAYS;
				this.MAX_HRS_IN_MONTH=MAX_HRS_IN_MONTH;
				
			}
			
			public static void main(String[] args) 
			{

				//local variables
				int Emp_Hrs=0;
				int Emp_Wage=0;
				int Total_Wage=0;
				int TotalEmpHrs=0;
				int TotalWorkingDays=0;
				
				EmpWage emp1 = new EmpWage("PaceX",20,20,100);//object creation
				
				// Computation
				while(TotalEmpHrs<emp1.MAX_HRS_IN_MONTH && TotalWorkingDays<emp1.NUM_WORKING_DAYS)
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
					Emp_Wage=Emp_Hrs*emp1.EMP_RATE_PER_HOUR ;
					Total_Wage+=Emp_Wage;
					System.out.println("Employee wage for the company "+emp1.company+" is "+Emp_Wage);
				}
				System.out.println("Total wage is "+Total_Wage);
				System.out.println("Total working hours is "+TotalEmpHrs);
				System.out.println("Total working days is "+TotalWorkingDays);
			}

}

		
				
		