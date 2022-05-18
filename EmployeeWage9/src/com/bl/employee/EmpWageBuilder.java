package com.bl.employee;

import java.util.Random;

public class EmpWageBuilder {

    int empHrs =  0, totalEmpHrs = 0, totalWorkingDays = 0;

    private String company;
    private int empRatePerHour, numberOfWorkingDays, maxHoursPerMonth;

    public EmpWageBuilder(String company, int empRatePerHour, int numberOfWorkingDays, int maxHoursPerMonth) {

        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void attendance() {

        int empCheck;

        Random rand = new Random();
        empCheck = rand.nextInt(3);
        switch (empCheck) {
            case 0:
                System.out.println("Employee Present(Full Time)");
                empHrs = 8;
                break;
            case 1:
                System.out.println("Employee Present(Half Time)");
                empHrs = 4;
                break;
            default:
                System.out.println("Employee Absent");
                empHrs = 0;
        }
        totalEmpHrs += empHrs;
        System.out.println("Day: " + totalWorkingDays + " Emp Hrs: " + empHrs);
    }

    public int computeEmpWage() {

        while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numberOfWorkingDays) {

            totalWorkingDays++;
            attendance();
        }
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Emp Wage for Company: " +company+" is: "+totalEmpWage);
        return totalEmpWage;
    }
}
