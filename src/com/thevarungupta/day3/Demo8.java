package com.thevarungupta.day3;

/**
 * OOPs - Object Oriented Programming
 * 4 main pillers  / principal of OOPs
 * 1. Inheritance
 * 2. Polymorphism
 * 3. Abstraction
 * 4. Encapsulation
 *
 * Inheritance
 * > It is a mechanism of consuming the members of one class in another class by
 *   eastablishing prent/ child class relationship between the class
 * > encourage code re-usability
 *
 * Employee => Parent / Base / Super
 * FTE => Child / Derived/ sub
 *
 * > In inheritance child class can consume members of its parent as it is owner of those
 *   members (except the private member of the parent class)
 *
 *
 *
 *
 *
 *
 *
 * */

class Employee{
    public int empId;
    public String firstName;
    public String lastName;
    public String email;
    public int age;

    public void getFullName(){
        System.out.println(firstName +" "+lastName);
    }
}

class FullTimeEmployee extends Employee{
    public int annualSalary;
}

class PartTimeEmployee extends Employee{
    public int hourSalary;
}



public class Demo8 {
    public static void main(String[] args) {
        FullTimeEmployee fte= new FullTimeEmployee();
        fte.firstName = "Mark";
        fte.lastName = "Smith";

        PartTimeEmployee pte = new PartTimeEmployee();
        pte.firstName = "Paul";
        pte.lastName= "Watson";

        fte.getFullName();
        pte.getFullName();
    }
}
