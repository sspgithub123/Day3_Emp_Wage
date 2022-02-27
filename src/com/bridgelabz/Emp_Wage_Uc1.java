package com.bridgelabz;

public class Emp_Wage_Uc1
{
    public static void main(String[] args)
    {

        int isfulltime = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == isfulltime)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");


    }
}
