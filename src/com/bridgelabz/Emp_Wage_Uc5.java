package com.bridgelabz;

public class Emp_Wage_Uc5 {
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;
    public static final int empRatePerHour = 20;
    public static final int nomOfWorkingDays = 2;

    public static void main(String[] args)
    {
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;


        for (int day = 0; day < nomOfWorkingDays; day++)
        {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;


            switch (empCheck)
            {
                case isPartTime:
                    empHrs = 4;
                    break;
                case isFullTime:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }

            empWage = (empHrs * empRatePerHour);
            totalEmpWage += empWage;
            System.out.println("Emp Wage: " + empWage);
        }

        System.out.println("Total emp Wage: " + totalEmpWage);

    }
}
