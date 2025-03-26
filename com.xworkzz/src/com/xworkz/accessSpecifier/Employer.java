package com.xworkz.accessSpecifier;

public class Employer {
        private int salary;

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }

        public static void main(String[] args) {
            Employer employer = new Employer();
            employer.setSalary(50000);
            System.out.println(employer.getSalary());
        }
    }

