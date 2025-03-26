package com.xworkz.accessSpecifier;

public class Employee {
    public String name = "john";
     private int salary = 10000;
     boolean isClass = false;

    public void printEmployeeName() {
        System.out.println("Running Employee NAME");
    }

    void validateEmployeeData() {
        System.out.println("Running check");
    }

    private void checkEmployeeAvailability() {
        System.out.println("Running checking");
}
}



