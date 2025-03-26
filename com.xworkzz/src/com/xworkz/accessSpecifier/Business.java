package com.xworkz.accessSpecifier;

public class Business {
        public static void main(String[] args) {
            Employee employee = new Employee();
            System.out.println(employee.isClass);
            System.out.println(employee.name);
           // System.out.println(employee.salary);
            System.out.println("running bussines");
            employee.printEmployeeName();
            employee.validateEmployeeData();

        }
    }


