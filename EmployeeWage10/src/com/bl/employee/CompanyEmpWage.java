package com.bl.employee;

public class CompanyEmpWage {

    public String company;
    public int empRatePerHour, numberOfWorkingDays, maxHoursPerMonth;

    private int totalEmpWage;

    public CompanyEmpWage(String company, int empRatePerHour, int numberOfWorkingDays, int maxHoursPerMonth) {

        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }
}
