package com.Employee;
import java.util.Random;
public class EmpWageComputation
{

	public static final int IS_EMP_FULL_TIME = 1;
   public static final int IS_EMP_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int WORKING_DAYS_IN_MONTH = 20;
	public static final int FULL_TIME_HOURS = 8;
	public static final int PART_TIME_HOURS = 4;

	public static int totalEmpHours = 0;
	public static int empHours = 0;
	public static int totalSalary = 0;
//	public static int empHours = 0;
	public static int totalWorkingDays = 0;
	public static int DailyWage = 0;

	public static int getWorkingHours(int empCheck)
	{
		switch (empCheck)
		{
			case IS_EMP_FULL_TIME:  empHours = FULL_TIME_HOURS ;
                                 break ;
         case IS_EMP_PART_TIME:  empHours = PART_TIME_HOURS ;
                                 break ;
         default: empHours=0  ;
      }
      return empHours;
   }

	public static int calculateDailyWage(int empHours)
   {
      DailyWage = empHours * EMP_RATE_PER_HOUR;
      return DailyWage;
   }

	public static void getMonthlyWage()
   {
		int empDailyWage[] = new int[100];
      while (totalWorkingDays < WORKING_DAYS_IN_MONTH)
      {
         Random randNo = new Random();
         int empCheck = randNo.nextInt() % 3;
         empHours = getWorkingHours(empCheck);
         totalEmpHours = totalEmpHours + empHours;
         totalWorkingDays++;
         empDailyWage[totalWorkingDays] = calculateDailyWage(empHours);
         System.out.println("Day "+totalWorkingDays + "       " + empDailyWage[totalWorkingDays]);
         totalSalary = totalSalary + empDailyWage[totalWorkingDays];
      }
         System.out.println("Total salary of employee=" + totalSalary);
   }

	public static void main(String args[])
	{
		System.out.println("Welcome to Employee Wage Computation/Problem");
		EmpWageComputation employee=new EmpWageComputation();
      employee.getMonthlyWage();
	}
}
