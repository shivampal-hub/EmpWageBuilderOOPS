package com.bl.employee;

public class EmployeeWageUC9 {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        EmpWageBuilder dmart = new EmpWageBuilder("Dmart",20, 20, 100);
        dmart.computeEmpWage();
        EmpWageBuilder reliance = new EmpWageBuilder("Reliance",25, 20, 100);
        reliance.computeEmpWage();
    }
}
