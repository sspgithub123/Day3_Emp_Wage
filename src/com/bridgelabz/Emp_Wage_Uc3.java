package com.bridgelabz;

public class Emp_Wage_Uc3
{
    public static void main(String[] args)
    {
        int isPartTime = 1;
        int isFullTime = 2;
        int empRatePerHour = 20;

        int empHrs = 0;
        int empWage = 0;

        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == isPartTime)
            empHrs = 4;
        else if (empCheck == isFullTime)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * empRatePerHour;
        System.out.println("Emp Wage: " + empWage);

    }
}
