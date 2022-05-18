package com.bl.employee;

import java.util.Random;

public class EmployeeWageUC10 {

    private int numberOfCompany = 0;
    private CompanyEmpWage[] companyEmpWagesArray;

    int empHrs =  0, totalEmpHrs = 0, totalWorkingDays = 0;

    public EmployeeWageUC10() {

        companyEmpWagesArray = new CompanyEmpWage[5];
    }

    private void addCompanyEmpWage(String company, int empRatePerHour, int numberOfWorkingDays, int maxHoursPerMonth) {
        companyEmpWagesArray[numberOfCompany] = new CompanyEmpWage(company, empRatePerHour, numberOfWorkingDays, maxHoursPerMonth);
        numberOfCompany++;
    }

    private void computeEmpWage() {
        for(int i = 0;i < numberOfCompany;i++) {
            companyEmpWagesArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWagesArray[i]));
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWageUC10 dmart = new EmployeeWageUC10();
        dmart.addCompanyEmpWage("Dmart",20, 20, 100);
        EmployeeWageUC10 reliance = new EmployeeWageUC10();
        reliance.addCompanyEmpWage("Reliance", 25, 20, 90);
        dmart.computeEmpWage();
        reliance.computeEmpWage();
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

    private int computeEmpWage(CompanyEmpWage companyEmpWage) {

        int totalEmpWage = 0;

        while(totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numberOfWorkingDays) {

            totalWorkingDays++;
            attendance();
            totalEmpWage = totalEmpHrs * companyEmpWage.empRatePerHour;
        }
        System.out.println("Total Emp Wage for Company: " +companyEmpWage.company+" is: "+totalEmpWage);
        return totalEmpHrs * companyEmpWage.empRatePerHour;
    }
}
